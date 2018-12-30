package dec27;

public class recursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		fpd(5);
//		fpi(5);
//		fpri(5);
//		foddeven(6);
		int power=power(3,4);
		System.out.println(power);
	}
	public static int power(int x,int n)
	{
	if(n==0)
	{
		return 1;
	}
	int d=power(x,n-1);
		int	e=d*x;
	return e;
	
	}
	
	
	
//	public static void foddeven(int x)
//	{
//		if(x==0)
//		{
//			return;
//		}
//		if(x%2==0)
//		{
//			System.out.println(x);
//		}
//		foddeven(x-1);
//		if(x%2!=0)
//		{
//			System.out.println(x);
//		}
//	}
//	public static void fpd(int x)
//
//	{
//		if(x==0)
//		{
//			return;
//		}
//		System.out.println(x);
//		fpd(x-1);
//	}
//	
//	//Expected fpi(5)=>1.2.3.4.5 
//	//faith  fpi(4)=>1,2,3,4,
//	//prove or do constant part
//	public static void fpi(int x)
//	{
//		if(x==0)
//		{
//			return;
//		}
//		fpi(x-1);
//		System.out.println(x);
//		
//	}
//	
//	public static void fpri(int x)
//	{
//		if(x==0)
//		{
//			return;
//		}
//		System.out.println(x);
//		fpri(x-1);
//		System.out.println(x);
//	}
//	
//	
}
