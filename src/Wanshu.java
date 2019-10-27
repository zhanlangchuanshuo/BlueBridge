import java.util.Scanner;

public class Wanshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		for(int i=2;i<=n;i++) {
			if(isWanshu(i)) {
				System.out.print(i+" its factors are");
				for(int j=1;j<=i/2;j++) {
					if(i%j==0) {
						System.out.print(" "+j);
					}
				}System.out.println();
			}
		}
	}
	public static boolean isWanshu(int x) {
		int s = 0;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0) {
				s+=i;
			}
		}
		if(s==x) {
			return true;
		}
		return false;
	}

}
