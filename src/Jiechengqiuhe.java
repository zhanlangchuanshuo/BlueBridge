import java.util.Scanner;

public class Jiechengqiuhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
//		int s = 0,last = 1;
//		for(int i=1;i<=n;i++) {
//			last = last*i;
//			s+=last;
//		}
//		System.out.print(s);
		int s = 0;
		for(int i=0;i<n;i++) {
			s+=jiecheng(i+1);
		}
		System.out.println(s);
	}
	public static int jiecheng(int n) {
		int m = 1;
		for(int i=0;i<n;i++) {
			m*=(i+1);
		}
		return m;
	}
	
}
