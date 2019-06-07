package april07and09;

import java.rmi.Remote;

public class bst {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private int size;
	private Node root;

	public int size() {
		return this.size;
	}

	public bst(int[] sa) {
		root = construct(sa, 0, sa.length - 1);
	}

	private Node construct(int[] sa, int si, int ei) {
		if (si > ei)
			return null;
		int mid = (si + ei) / 2;
		Node node = new Node();
		this.size++;
		node.data = sa[mid];
		node.left = construct(sa, si, mid - 1);
		node.right = construct(sa, mid + 1, ei);
		return node;

	}
	public  static Node add(Node root,int data){
		if(root==null){
		Node node=new Node(data);
			return root;
		}
		if(data>root.data){
			root.right=add(root.right, data);
		}
		else if(data<root.data){
			root.left=add(root.left, data);
		}
			return root;
	}
	
	public static Node Remove(Node root,int data){
		if(root==null){
			return root;
		}
		if(root.data==data){
			if(root.left!=null && root.right!=null){
				int lmax=Max(root.left);
				root.data=lmax;
				root.left=Remove(root.left, data);
			}	
			
			if(root.left!=null ){
						return root.right;
					}
			else if(root.right!=null){
						return root.left;
					}
					
				
				else{
					root=null;
				}
			}
		else if(data>root.data){
				root.right=Remove(root.right, data);
			}
		else if(data<root.data){
				root.left=Remove(root.left, data);
			}
		
		return root;
			
	}
	//complexity of n raised to n
	public static int CountBST(int n){ 
		if(n==0){
			return 1;
		}
		if(n==1){
			return 1;
		}
		int c=0;
		for(int i=0;i<n;i++){
			c+=CountBST(i)*CountBST(n-i-1);
		}
		return c; 
	}

	public static void main(String[] args){
		int[] arr=new int[]{12,25,30,37,40,50,60,62,70,75,87};
//		Node root=new Node();
//		Remove(root, 25);
		System.out.println(CountBST(12));
	}
	
}