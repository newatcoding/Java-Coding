package page7;

import java.util.Scanner;

public class IndexOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scn=new Scanner(System.in);
          int n=scn.nextInt();
          int[] arr=new int[n];
          for(int i=0;i<n;i++)
          {
              arr[i]=scn.nextInt();
          }
      int num=scn.nextInt();
          int br=checksortedarray(0,arr,-1,num);
          System.out.println(br);

      }
  
  public static int checksortedarray(int n,int[] arr,int pos,int num)
  {
      if(n==arr.length || pos!=-1)
      {
          return pos;
      } 
          if(arr[n]==num)
          {
              pos=n;
          }
          pos=checksortedarray(n+1, arr,pos,num);
          return pos;
          
  }
  }