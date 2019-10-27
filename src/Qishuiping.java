import java.util.Scanner;

public class Qishuiping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while(n!=0) {
			System.out.print(bottle(n));
			n = input.nextInt();
		}
		input.close();
	}
	public static int bottle(int n) {
		int b=n,all=0;
		do {
			all += b/3;
			b = b/3+b%3;
		}while(b>2);
		if(b==2) all++;
		return all;
	}

}
