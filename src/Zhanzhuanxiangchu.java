import java.util.Scanner;

public class Zhanzhuanxiangchu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		input.close();
		System.out.print(gys(m,n)+" "+gbs(m,n));
		
	}
	public static int gys(int m,int n) {
		if(m%n==0) {
			return n;
		}else {
			while(m%n!=0) {
				int r = m%n;
				m = n;
				n = r;
			}
			return n;
		}
	}
	public static int gbs(int m,int n) {
		int g = gys(m,n);
		return (m/g*n);
	}

}
