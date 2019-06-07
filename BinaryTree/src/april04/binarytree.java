package april04;
import java.util.*;


public class binarytree {
	private static class Node {
		
		public int data;
		public Node left;
		public Node right;
		Node (int data){
			this.data=data;
			
		}
	}
	private static 	Node construct(ArrayList<Integer> dlist){
		ArrayList<Node> stack=new ArrayList<>();
		Node root=null;
		
		for (int i = 0; i < dlist.size(); i++) {
				
			if (dlist.get(i) == -1) {
				stack.remove(stack.size() - 1);
			}

			else {
				Node nn = new Node(dlist.get(i));
				if (stack.size() == 0) {
					root = nn;
				} else {
					Node lastnode = stack.get(stack.size() - 1);
					if(lastnode.left==null){
						lastnode.left=nn;
					}
					else{
						lastnode.right=nn;
					}

				}
				stack.add(nn);

			}

		}
		return root;
		
	}
	private static void display(Node root){
		if(root.left!=null && root.right!=null){
			System.out.println(root.data+"->"+root.left.data+"->"+root.right.data);
				display(root.left);
				display(root.right);
		}
		else if(root.left!=null){
			System.out.println(root.data+"->"+root.left.data+"->"+root.right.data);
			ls=Size1(root.left);
				
			 display(root.left);
		}
		else if(root.right!=null){
			System.out.println(root.data+"->"+root.left.data+"->"+root.right.data);
			display(root.right);
			rs=Size1(root.right);
		}
		else{
			System.out.println(root.data+"->"+root.left.data+"->"+root.right.data);
		}
	}
	
	//proactive -1st way 
	public static int Size1(Node root){
		if(root==null){
			return 0;
		}
		int ls=Size1(root.left);
		int rs=Size1(root.right);
		return ls+rs+1;
		
	}
	//reactive - 2nd way
	
	public static int Size2(Node root){
		int ls=0; int rs=0;
		if(root.left!=null){
			ls=Size1(root.left);
		}
		if(root.right!=null){
			rs=Size1(root.right);
		}
		return ls+rs+1;
	}
	
	//All cases -3rd way 
	public static int Size3(Node root){
		int ls =0; int rs=0;
		if(root.left!=null && root.right!=null){
			 ls=Size1(root.left);
			 rs=Size1(root.right);
				
		}
		else if(root.left!=null){
			 ls=Size1(root.left);
				
			
		}
		else if(root.right!=null){
		
			rs=Size1(root.right);
		}
		else{
			
		}
		return ls+rs+1;
	}
	
	
	public static int Sum(Node root){
		if(root.left==null && root.right==null){
			return root.data;
		}
//		if(root==null){
//			return 0;
//		}
		
		int ls=Sum(root.left);
		int rs=Sum(root.right);
		return ls+rs+root.data;
	}
	
	public static int  Max(Node root){
		if(root==null){
			return Integer.MIN_VALUE;
		}
		
			int lmax=Max(root.left);
			
			int rmax=Max(root.right);
			return Math.max(root.data, Math.max(lmax, rmax));
	}
	
	public static int Height(Node root){
		if(root==null){
			return 0;
		}
		int lh=Height(root.left);
		int rh=Height(root.right);
		return lh+rh+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(50,25,12,-1,37,30,-1,
																		40,-1,-1,-1,75,62
																	,60,-1,70,-1,-1,87,-1,-1,-1));
		Node root=construct(list);
		System.out.println(Size1(root));
		System.out.println(Size2(root));
		System.out.println(Size3(root));
		//in case you want to try your own method answer these question
		//Q1-> is the code visiting all node 
		//Q2-> Does it handle all nulls
		//use this test case (60,25,12,-1,37,30,-1,-1,75,62,70,-1,-1,87,-1,-1) or any case with
		//only one part either left or right for any elementc 
	    System.out.println(Sum(root));  //Sum(root);
	    System.out.println(Max(root));
	    System.out.println(Height(root));
	}

}
