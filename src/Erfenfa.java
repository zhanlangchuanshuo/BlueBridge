import java.util.Scanner;

public class Erfenfa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true) {
			int n = input.nextInt();
			if(n==0) break;
			int[] t = new int[n];
			int cf0 = input.nextInt();
			for(int i=0;i<n;i++) {
				t[i] = input.nextInt();
			}
			
			double l=-1,r=9999;
			while((r-l)>1e-5) {
				double sum=cf0;
				double d = (l+r)/2;
				double fenmu = (1+d);
				for(int i=0;i<t.length;i++) {
					sum+=t[i]/fenmu;
					fenmu*=(1+d);
				}
//				System.out.println("sum="+sum);
				if(sum>0) l=d;
				else r=d;
			}
			System.out.println(String.format("%.2f", l));
			
		}
		input.close();
		
	}

}
