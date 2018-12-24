package hackerrank;

import java.util.Scanner;

public class numbersystremandfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a=new Scanner(System.in);
        int sn=a.nextInt();
        int sb=a.nextInt();
        int db=a.nextInt();
        
       
            int bin=convertbase(sn,sb,db);
                   System.out.println(bin);
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
