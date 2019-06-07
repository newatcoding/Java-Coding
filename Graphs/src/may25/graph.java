package may25;

import java.nio.file.Path;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class graph {

	static class Edge {
		private int ne; // neighbour
		private int we; // width

		Edge(int n, int w) {
			this.ne = n;
			this.we = w;
		}

	}

	public static void addEdge(ArrayList<ArrayList<Edge>> graph, int v1, int v2, int wt) {
		graph.get(v1).add(new Edge(v2, wt));
		graph.get(v2).add(new Edge(v1, wt));
	}

	public static void display(ArrayList<ArrayList<Edge>> graph) {
		for (int v = 0; v < graph.size(); v++) {
			System.out.print(v + "-> ");
			for (int n = 0; n < graph.get(v).size(); n++) {
				System.out.print(" " + graph.get(v).get(n).ne + ": " + graph.get(v).get(n).we + "; ");
			}
			System.out.println();
		}
	}

	public static boolean hasPath(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean[] visited) {
		if (src == dest) {
			return true;
		}
		visited[src] = true;
		for (int i = 0; i < graph.get(src).size(); i++) {
			Edge n = graph.get(src).get(i);

			if (visited[n.ne] == false) {

				if (hasPath(graph, n.ne, dest, visited) == true) {
					return true;

				}
			}

		}
		return false;
	}

	// print all paths
	public static void printAllPaths(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean[] visited,
			String pathSoFar, int dist) {

		if (src == dest) {
			System.out.println((pathSoFar + src) + "  @ " + dist);
			return;
		}
		visited[src] = true;
		for (int i = 0; i < graph.get(src).size(); i++) {
			Edge n = graph.get(src).get(i);

			if (visited[n.ne] == false) {

				printAllPaths(graph, n.ne, dest, visited, pathSoFar + src + "-", dist + n.we);

			}

		}
		visited[src] = false;

	}

	// shortest path
	public static int min = Integer.MAX_VALUE;
	public static String spath = " ";

	// longest ath
	public static int max = Integer.MIN_VALUE;
	public static String lpath = " ";

	public static void path_distance(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean[] visited, String psf,
			int dist) {

		if (src == dest) {
			if (min > dist) {
				min = dist;
				spath = psf + src;
			}

			if (max < dist) {
				max = dist;
				lpath = psf + src;
			}

		}
		visited[src] = true;
		for (int i = 0; i < graph.get(src).size(); i++) {
			Edge n = graph.get(src).get(i);

			if (visited[n.ne] == false) {

				path_distance(graph, n.ne, dest, visited, psf + src + "-", dist + n.we);

			}

		}
		visited[src] = false;

	}

	// ceil path
	public static int dtn = 0;
	public static String ceilpath = "";

	public static String floorpath = "";

	public static void ceilfloor_path(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean[] visited,
			String psf, int dist, int val) {
		if (src == dest) {
			if (min > dist && dist > val) {
				min = dist;
				ceilpath = psf + src;
			}

			if (max < dist && dist < val) {
				max = dist;
				floorpath = psf + src;
			}

		}
		visited[src] = true;
		for (int i = 0; i < graph.get(src).size(); i++) {
			Edge n = graph.get(src).get(i);

			if (visited[n.ne] == false) {

				ceilfloor_path(graph, n.ne, dest, visited, psf + src + "-", dist + n.we, val);

			}

		}
		visited[src] = false;
	}

	// //public static void kthLargest(ArrayList<ArrayList<Edge>> graph ,int
	// src,int dest ,int k){
	//
	// String kpath="";
	// int limit=Integer.MAX_VALUE;
	// for(int i=0;i<k;i++){
	// lpath="";
	// max=Integer.MAX_VALUE;
	// ceilfloor_path(graph, src, dest,new boolean[8], "",0 , limit);
	// limit=max;
	// kpath=lpath;
	// }
	// }

	static class THelper {
		private int v = 0;
		private String psf = "";
		private int dsf = 0;

		THelper(int v, String psf, int dsf) {
			this.v = v;
			this.psf = psf;
			this.dsf = dsf;
		}
	}

	public static boolean bsf(ArrayList<ArrayList<Edge>> graph, int src, int dest) {
		LinkedList<THelper> queue = new LinkedList<>();
		boolean[] visited = new boolean[graph.size()];

		queue.add(new THelper(0, "0", 0));
		while (queue.size() > 0) {
			THelper rem = queue.get(src);
			queue.removeFirst();
			System.out.println(rem.v + " via " + rem.psf + "@" + rem.dsf);
			
			if (visited[rem.v] == true) {
				continue;
			} else {
				visited[rem.v] = true;
			}
			
			if (rem.v == dest) {
				return true;
			}

			for (int i = 0; i < graph.get(rem.v).size(); i++) {
				Edge ne = graph.get(rem.v).get(i);
				if (visited[ne.ne] == false) {
					THelper nbr = new THelper(ne.ne, rem.psf + ne.ne, rem.dsf + ne.we);
					queue.addLast(nbr);
				}
				
			}

		}
		return false;
	}
	
	
	static class mat_pos{
		private int row=0;
		private int col=0;
		private int t=0;
		mat_pos(int row ,int col,int time){
			this.row=row;
			this.col=col;
			this.t=time;
		}
	}
	//validity check
	public static boolean isValid(int[][] arr,int i,int j){
		if(i<0 || i>=arr.length || j<0 || j>=arr[0].length){
			return false;
		}
		else if(arr[i][j]==-1){
			return false;
		}
		else if(arr[i][j]==0){
			return false;
		}
		else{
			return true;
		}
	}
	//City of destruction 0->wood 1->water 2->fire or fire storm
	public static void City_fire(int[][] arr,int t){
		LinkedList<mat_pos> queue=new LinkedList<>();
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==0){
					queue.add(new mat_pos(i, j, 0));
				}
			}
		}
		
		while(queue.size()>0 && queue.getFirst().t<=t){
			mat_pos rem=queue.getFirst();
			queue.removeFirst();
			if(arr[rem.row][rem.col]>0){
				continue;
			}
			else{
				arr[rem.row][rem.col]=rem.t;
			}
			System.out.println(rem.row+""+rem.col+" @"+rem.t );
			if(isValid(arr, rem.row+1, rem.col))
				queue.addLast(new mat_pos(rem.row+1, rem.col, rem.t+1));
			if(isValid(arr, rem.row-1, rem.col))
				queue.addLast(new mat_pos(rem.row-1, rem.col, rem.t+1));
			if(isValid(arr, rem.row, rem.col-1))
				queue.addLast(new mat_pos(rem.row, rem.col-1, rem.t+1));
			if(isValid(arr, rem.row, rem.col+1))
				queue.addLast(new mat_pos(rem.row, rem.col+1, rem.t+1));
		}
		
		
		
		
	}

	public static String getConnectedComponent(ArrayList<ArrayList<Edge>> graph,
			boolean[] visited,int src){
		LinkedList<Integer> queue=new LinkedList<>();
		queue.add(src);
		String comp="";
		while (queue.size() > 0) {
			int  rem = queue.removeFirst();
			if (visited[rem] == true) {
				continue;
			} else {
				visited[rem] = true;
			}
			
			
			comp+=rem;
			for (int i = 0; i < graph.get(rem).size(); i++) {
				Edge ne = graph.get(rem).get(i);
				if (visited[ne.ne] == false) {
					queue.addFirst(ne.ne);
				}
				
			}

		}
		return comp;
		
	}
	
	//get get connected components
	public static ArrayList<String> getConnectedComponents(ArrayList<ArrayList<Edge>> graph){
		ArrayList<String> comps=new ArrayList<>();
		boolean[] visited=new boolean[graph.size()];
		Edge ne=graph.get(0).get(0);
		for(int i=0;i<graph.size();i++){
			if(visited[i]==false){
				String str=getConnectedComponent(graph, visited, i);
				comps.add(str);
			}
		}
		return comps;
	}
	
	
	public static boolean isValid_island(int[][] arr,int i,int j){
		if(i<0 || i>=arr.length || j<0 || j>=arr[0].length){
			return false;
		}
		else if(arr[i][j]==-1){
			return false;
		}
		else{
			return true;
		}
	}
	public static int ConnectedIsland(int[][] arr,int i,int j){
		LinkedList<mat_pos> queue=new LinkedList<>();
		queue.add(new mat_pos(i, j, 0));
		int sum=1;
		while(queue.size()>0){
			mat_pos rem=queue.removeFirst();
			
			if(arr[rem.row][rem.col]>0){
				continue;
			}
			
			else{
				arr[rem.row][rem.col]=1;
			}
			
			if(isValid_island(arr, i+1, j)){
				
				queue.addLast(new mat_pos(i+1, j, 0));        
				
				
			}
			if(isValid_island(arr, i-1, j)){
				queue.addLast(new mat_pos(i-1, j, 0));  
				
				}
			if(isValid_island(arr, i, j+1)){
				queue.addLast(new mat_pos(i+1, j+1, 0));     
				
				}
			if(isValid_island(arr, i, j-1)){
				queue.addLast(new mat_pos(i+1, j-1, 0));
				
				}
		}
		
		return sum;
		
	}
	
	public static  ArrayList<Integer> ConnectedIslands(int[][] arr){
		ArrayList<Integer> island=new ArrayList<>();
		boolean[][] visited=new boolean[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]==0 && arr[i][j]!=-1){
					
					island.add(ConnectedIsland(arr,i, j));
					
				}
			}
		}
		return island;
	}
	
	public static boolean Cyclecomponent(ArrayList<ArrayList<Edge>> graph,boolean[] visited,int src){
		LinkedList<Integer> queue=new LinkedList<>();
		queue.add(src);
		String comp="";
		while (queue.size() > 0) {
			int  rem = queue.removeFirst();
			if (visited[rem] == true) {
				return true;
			} else {
				visited[rem] = true;
			}
			
			
			comp+=rem;
			for (int i = 0; i < graph.get(rem).size(); i++) {
				Edge ne = graph.get(rem).get(i);
				if (visited[ne.ne] == false) {
					queue.addFirst(ne.ne);
				}
				
			}

		}
		return false;
	}
	public static boolean isCycle(ArrayList<ArrayList<Edge>> graph){
		
		boolean[] visited=new boolean[graph.size()];
		Edge ne=graph.get(0).get(0);
		for(int i=0;i<graph.size();i++){
			if(visited[i]==false){
				boolean res=Cyclecomponent(graph, visited, i);
				if(res==true){
					return true;
				}
			}
		}
		return false;
	}
	
	public static int[] getgccAstronautComponent(ArrayList<ArrayList<Edge>> graph,boolean[] visited
			int src){
		LinkedList<Integer> queue=new LinkedList<>();
		queue.add(src);
		String comp="";
		while (queue.size() > 0) {
			int  rem = queue.removeFirst();
			if (visited[rem] == true) {
				continue;
			} else {
				visited[rem] = true;
			}
			
			
			comp+=rem;
			for (int i = 0; i < graph.get(rem).size(); i++) {
				Edge ne = graph.get(rem).get(i);
				if (visited[ne.ne] == false) {
					queue.addFirst(ne.ne);
				}
				
			}

		}
		return comp;
	}
	public static ArrayList<ArrayList<Integer>> getgccAstronaut(ArrayList<ArrayList<Edge>> graph){
		ArrayList<ArrayList<Integer>> comps;
		boolean[] visited=new boolean[graph.size()];
		
		for(int v=0;v<graph.size();v++){
			if(visited[v]==false){
				String comp=getgccAstronautComponent(graph,visited,v);
				comps.add(comp);
			}
		}
		return comps;
	}
	public static int Astronaut_Moon(int[] arr1,int[] arr2,int n){
		ArrayList<ArrayList<Edge>> graph = new ArrayList<>(n);
		for (int v = 0; v <n; v++) {
			graph.add(new ArrayList<>());
		}
		for(int i=0;i<arr1.length;i++){
			addEdge(graph, arr1[i], arr2[i], 1);
		}
		ArrayList<ArrayList<Integer>> comps=getgccAstronaut(graph);
		
		int sum=0;
		for(int n1=0;n1<comps.size();n1++){
			for(int n2=n1+1;n2<comps.size();n2++){
				int term=comps.get(n1).size()*comps.get(n2).size();
				sum+=term;
			}
		}
		return sum;
		
	}
	static class BHelper{
		public int v=0;
		public int level=0;
		
		BHelper(int v,int l){
			this.v=v;
			this.level=l;
		}
	}
	public static boolean BiPartingGraphs(ArrayList<ArrayList<Edge>> graph,int[] visited,int src){
		LinkedList<BHelper> queue=new LinkedList<>();
		queue.add(new BHelper(0, 0));
		
		
		ArrayList<Integer> sodd=new ArrayList<>();
		ArrayList<Integer> seven=new ArrayList<>();
		
		while (queue.size() > 0) {
			BHelper  rem = queue.removeFirst();
			if (visited[rem.v] == 0) {
				if(visited[rem.v]%2!=rem.level%2){
					return false;
				}
				continue;
			} else {
				visited[rem.v] = rem.level;
			}
			
			
			
			for (int i = 0; i < graph.get(rem.v).size(); i++) {
				Edge ne = graph.get(rem.v).get(i);
				
				if (visited[ne.ne] == -1) {
					queue.addFirst(BHelper(ne.ne,rem.level+1));
				}
				
				
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
		for (int v = 0; v < 9; v++) {
			graph.add(new ArrayList<>());
		}
		addEdge(graph, 0, 3, 40);
		addEdge(graph, 0, 1, 10);
		addEdge(graph, 1, 2, 10);
		addEdge(graph, 2, 3, 10);
		addEdge(graph, 3, 4, 2);
		addEdge(graph, 4, 5, 3);
		addEdge(graph, 5, 6, 3);
		addEdge(graph, 6, 4, 8);
		addEdge(graph, 6, 7, 4);
		addEdge(graph, 7, 8, 5);
		display(graph);
		// //adding a new vertex
		// graph.add(new ArrayList<>());
		// addEdge(graph, 6, 7, 1);

	//	System.out.println(hasPath(graph, 0, 5, new boolean[8]));
//		printAllPaths(graph, 0, 6, new boolean[8], "", 0);

	//	path_distance(graph, 0, 6, new boolean[8], "", 0);
//		System.out.println("shortest path ->" + spath);
//		System.out.println("Longest path ->" + lpath);
//		min = Integer.MAX_VALUE;
//		max = Integer.MIN_VALUE;
		//ceilfloor_path(graph, 0, 6, new boolean[8], "", 0, 47);
	//	System.out.println("Ceil path ->" + ceilpath);
	//	System.out.println("floor path ->" + floorpath);
	//	bsf(graph, 0, 6);
		int[][] arr={ {-2,-2,0,-2,-2,-2},
					  {-2,-1,-1,-2,-1,-1},
					  {-2,-2,-2,-2,-2,-2},
					  {-2,-2,-2,-2,-1,-1},
					  {-2,-1,-1,0,-2,-2} };
		
		
		//City_fire(arr,3);
//		System.out.println(getConnectedComponents(graph));
		int[][] arr_island={{0,0,-1,0,0},{0,-1,-1,-1,-1},{-1,0,0,0,0},{0,-1,0,-1,0},{0,-1,-1,-1,0}};
	//	System.out.println(ConnectedIslands(arr_island));
		System.out.println(isCycle(graph));
		int[] arr1={1,6,8,2,9,10,0};
		int[] arr2={2,9,3,5,5,3,11};
		System.out.println(Astronaut_Moon(arr1, arr2, 2));
	}

}
