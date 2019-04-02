package mar16;



public class DetectAndRemoveLoop {
	private static class Node{
		public 
			int data;
			Node next;
			Node(int data){
				this.data=data;
			}
	}
	public void display(Node n1){
		for(Node temp=n1; temp!=null;temp=temp.next){
			System.out.print(temp.data+" ");
		}
		System.out.println();
	}
	
	public boolean detectLoop(Node n){
		Node slow=n;
		Node fast=n;
		slow=slow.next;
		fast=fast.next.next;
		while(slow!=fast  && fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		if(slow==fast){
	
			removeLoop(n,fast);
			return true;
		}
		else{
			return false;
		}
			
	}
	
	public void removeLoop(Node n,Node fast){
		Node slow=n;
		Node prev=fast;
		while(slow!=fast){
			slow=slow.next;
			prev=fast;
			fast=fast.next;
		}
		prev.next=null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node n6=new Node(6);
		Node n7=new Node(7);
		Node n8=new Node(8);
		Node n9=new Node(9);
		Node n10=new Node(10);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n8;
		n8.next=n9;
		n9.next=n10;
		n10.next=n5;
		
	//	boolean res=darloop(n1);
		DetectAndRemoveLoop l=new DetectAndRemoveLoop();
		System.out.println(l.detectLoop(n1));
		//System.out.println(res+" ");
		
		l.display(n1);
	}

}
