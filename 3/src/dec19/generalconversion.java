package dec19;

public class generalconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dn =convertbase(456,8,10);
		int dn1 = convertbase(dn ,10 , 2);
		
		System.out.println(dn1 + " ");

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
