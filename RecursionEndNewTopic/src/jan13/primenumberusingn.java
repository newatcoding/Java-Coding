package jan13;

import java.util.Arrays;
import java.util.Scanner;

public class primenumberusingn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int range=scn.nextInt();
		
		boolean[] strng=new boolean[range+1]; 
		Arrays.fill(strng, true); //method to fill the array
		strng[0]=false;
		strng[1]=false;
		long start= System.currentTimeMillis();
		for(int i=2;i<range;i++)
		{
			if(strng[i]==true )
			{
				System.out.println(i);
			for(int j=i+1;j<range;j++)
			{
				if(j%i==0)
				{
					strng[j]=false;
				}
			}
			}
			
		}
		long end=System.currentTimeMillis();
		System.err.println(end-start);
	}

}
