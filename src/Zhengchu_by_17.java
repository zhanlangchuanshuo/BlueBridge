import java.util.Scanner;
import java.math.BigInteger;
public class Zhengchu_by_17 {
	
	public static int can_devided_by_17(BigInteger n) {
		BigInteger st = new BigInteger("17");
		if(n.compareTo(st)<=0) {
			return 0;
		}
		BigInteger last = n.remainder(BigInteger.TEN);
		BigInteger rid_last = n.divide(BigInteger.TEN);
		BigInteger five = new BigInteger("5");
		if(((rid_last.subtract(last.multiply(five))).remainder(st))
				.equals(BigInteger.ZERO)) {
			return 1;
		}
		return 0;
	}
	public static int can_devided_by_17(int n) {
		if(n<17) {
			return 0;
		}
		int last = n%10;
		int rid_last = n/10;
		if((rid_last - last*5)%17 == 0) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		do {
			if(s.length() < 10) {
				int n = Integer.valueOf(s);
				System.out.println(can_devided_by_17(n));
			}else {
				BigInteger n = new BigInteger(s);
				System.out.println(can_devided_by_17(n));
			}
			
			s = input.nextLine();
		}while(! s.equals("0"));
		input.close();

	}

}
