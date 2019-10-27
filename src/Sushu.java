import java.util.Scanner;

public class Sushu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
