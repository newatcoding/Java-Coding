package dec19;

abstract class function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dn = convertbase(57, 10, 2);
		System.out.println(dn + " ");

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
