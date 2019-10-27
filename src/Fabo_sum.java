import java.util.Scanner;

public class Fabo_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		int[] fa = new int[n+2];
		fa[0] = 1;
		fa[1] = 1;
		for(int i=0;i<n;i++) {
			fa[i+2] = fa[i]+fa[i+1];
		}
		double s = 0;
		for(int i=1;i<fa.length-1;i++) {
			s+=1.0*fa[i+1]/fa[i];
		}
		System.out.print(String.format("%.2f",s));
	}

}
