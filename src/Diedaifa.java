import java.util.Scanner;

public class Diedaifa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//		double n = input.nextDouble();
		int n = input.nextInt();
		input.close();
		
		double a;
		double b = n/2;
		do {
			a = b;
			b = (a+1.0*n/a)/2;
		}while(Math.abs(b-a)>1e-5);
		System.out.println(String.format("%.3f", b));
	}

}
