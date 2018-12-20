package dec19;

public class octalmultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dn = multiplyoctal(16,6);
		System.out.println(dn + " ");

	}

	public static int multiplyoctal(int num1, int num2) {
		int p=1;	int q=1;
		int rem1;
		int rem2;
		int ans=0;
		int mul = 0; int c=0;
		int total=0;
		int numrep=num1;
		while (num1!= 0 || num2!=0 || c!=0 ) {
			num1=numrep;
			while(num1!=0 || c!=0)
			{	
			rem1= num1%10;
			rem2=num2%10;
			mul=rem1*rem2+c;
					int r=mul%8;
			c=mul/8;
			ans=ans+r*p;
			p=p*10;
			num1=num1/10;
			}	
			total=total +ans*q;
			num2=num2/10;
			q=q*10;
			}
		return total ;
	}

}
//condition num1 should be greater than num 2