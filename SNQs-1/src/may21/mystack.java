package may21;


public class mystack {

	
		private int[] data;
		private int cap=0;
		private int tos=-1;
		public mystack(int cap){
			this.data=new int[cap];
			this.cap=cap;
			this.tos=-1;
		}
		
		public void push(int val)
		{
			if(tos==cap-1){
				System.out.println("Stack Overflow");
				return ;
			}
			
			tos++;
			data[tos]=val;
		}
		
		public int peek()
		{
			if(tos==-1){
				return -1;
			}
			return data[tos];
		}
		
		public int pop()
		{
			if(tos==-1){
				System.out.println("Stack underflow");
				return -1;
			}
			int num=data[tos];
			tos--;
			return num;
			
		}
		
		public int  size()
		{
			return tos+1;
		}
		
		public boolean isEmpty()
		{
			if(tos==-1){
				return true;
			}
			else
			{
				return false;
			}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mystack  st=new  mystack(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		
		while(st.size()>0){
			System.out.println(st.pop());
		}
		
		st.pop();
	}
	
	}


