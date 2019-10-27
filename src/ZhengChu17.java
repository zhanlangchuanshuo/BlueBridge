import java.math.BigInteger;
import java.util.Scanner;

public class ZhengChu17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BigInteger n = input.nextBigInteger();
		while(n.compareTo(BigInteger.ZERO)!=0) {
			System.out.println(canDivide(n));
			n = input.nextBigInteger();
		}input.close();
	}
	public static int canDivide(BigInteger n) {
		int a = (n+"").length();
		while(a>5) {
			n = n.divide(BigInteger.TEN).subtract((n.mod(BigInteger.TEN).multiply(BigInteger.valueOf(5))));
			a = (n+"").length();
		}
		return (n.intValue()%17==0)?1:0;
	}

}
