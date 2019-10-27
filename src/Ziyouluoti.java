import java.util.Scanner;

public class Ziyouluoti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		input.close();
		double s = 0;
		double fantan = m;
		for(int i=0;i<n;i++) {
			s += fantan*2;
			fantan /= 2;
		}
		System.out.print(String.format("%.2f %.2f",fantan,s-m));
	}

}
