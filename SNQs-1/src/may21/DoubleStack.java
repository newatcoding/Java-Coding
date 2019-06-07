package may21;

public class DoubleStack {
	private int[] data;
	private int cap=0;
	private int tos1=-1;
	private int tos2=cap;
	
	public DoubleStack(int cap){
		this.data=new int[cap];
		this.cap=cap;
		this.tos1=-1;
		this.tos2=cap;
	}
	
	public void push1(int val){
		if(tos2-tos1==1){
			System.out.println("Stack overload");
			return;
		}
		//System.out.println(tos1+" 1");
		
		tos1++;
		//System.out.println(tos1+" 1");
		data[tos1]=val;
	}
	
	public void push2(int val){
		if(tos2-tos1==1){
			System.out.println("Stack overload");
			return;
		}
		//System.out.println(tos2+" 2");
		tos2--;
		//System.out.println(tos2+" 2");
		data[tos2]=val;
		
		
	}
	
	public int peek1(){
		return data[tos1];
	}
	
	public int peek2(){
		return data[tos2];
	}
	
	public int pop1(){
		if(tos1==-1){
			System.out.println("Stack underflow");
			return -1;
		}
		int num=data[tos1];
		data[tos1]=0;
		tos1--;
		return num;
	}
	
	public int pop2(){
		if(tos2==cap){
			System.out.println();
			return cap;
		}
		int num=data[tos2];
		data[tos2]=0;
		tos2++;
		return num;
	}
	
	public boolean isEmpty(){
		if(tos1==-1 && tos2==cap){
			return true;  
		}
		
		else {
			return false;
		}
	}
	
	public int size1(){
		return tos1+1;
		
	}
	
	public int size2(){
		//System.out.println(tos2-1);
		return tos2-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleStack  st=new  DoubleStack(5);
		st.push1(10);
		st.push1(20);
		st.push2(30);
		st.push2(40);
		st.push1(50);
		st.push2(60);
		
		while(st.size1()>0){
			System.out.print(st.pop1()+" ");
		}
		System.out.println();
		while(st.size2()<4){
			System.out.print(st.pop2()+" ");
		}
		//st.pop1();
	}

}
