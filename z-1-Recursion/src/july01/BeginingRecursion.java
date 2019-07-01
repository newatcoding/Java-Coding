package july01;

public class BeginingRecursion {

	public static void PD(int n){
		if(n==0){
			return;
		}
		PD(n-1);
		System.out.print(n+", ");
	}
	
	public static void PDI(int n){
		if(n==0){
			return;
		}
		System.out.print(n+", ");
		PDI(n-1);
		System.out.print(n+", ");
	}
	
	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		int ans=factorial(n-1)*n;
		
		return ans;
	}
	
	///O(n) time
	public static int Power(int x,int n){
		if(n==0){
			return 1;
		}
		int ans=x*Power(x, n-1);
		return ans;
		
	}
	
	//log(n) time complexity
	public static int Powereff(int x,int n){
		if(n==1){
			return x;
		}
		
		int res=Powereff(x, n/2);
		if(n%2==0){
		return res*res;
		}
		else{
			return res*res*x;
		}
	}
	
	//power fake better as when you form euler same value will be calculated again, so no use
//	powerbtr(x,n)
//	if(n==1){
//		return x;
//	}
//	if(n%2==0){
//		return powerbtr(x,n/2)*powerbtr(x,n/2);
//	}
//	else{
//		return powerbtr(x,n/2)*powerbtr(x,n/2)*x;
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PD(5);
		PDI(5);
		System.out.println();
		System.out.println(factorial(10));
		System.out.println(Power(2, 0));
		System.out.println(Powereff(3, 5));
		
	}

}
