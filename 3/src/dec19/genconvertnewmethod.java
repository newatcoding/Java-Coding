package dec19;

public class genconvertnewmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int dn = convertbase(547, 10, 2);
//
//		System.out.println(dn + " ");
//
//	}

//	public static int convertbase(int sn, int sb, int db) {
//		int sum = 0;
//		int mul = 10;
//		int kn = sn % mul;
//		int p = 1;
//		while (kn != 0) {
//	
//			mul = mul * 10;//100
//
//			int pow = 1;
//			int rem;
//
//			while (kn != 0) {
//				rem = kn % db;
//				sn = kn / db;
//				sum = sum + rem * pow;
//				pow = pow * sb;
//
//			}
//			sum = sum * p;
//			p = p * 1000;
//			kn = sn / mul;
//		}
//		return sum;
//		System.out.println(convertbase(10, 4, 2));
		int num=77;
		int sum=0;
		int pow=1;
		while(num!=0)
		{
			int rem=num%10;
			num=num/10;
			int bin=convertbase(rem,10,2);
					sum=sum+bin*pow;
			pow=pow*1000;
		}
		System.out.println(sum);
		}
		public static int convertbase(int sn, int sb, int db) {
			int pow = 1;
			int rem;
			int sum = 0;
			while (sn != 0) {
				rem = sn % db;
				sn = sn / db;
				sum = sum + rem * pow;
				pow = pow * sb;

			}
			return sum;

	}
}
