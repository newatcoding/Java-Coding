package may21;
import java.util.*;
public class minStack {
		
	private int[] data;
	private int cap=0;
	private int tos=-1;
	public minStack(int cap){
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
				
	}

}
