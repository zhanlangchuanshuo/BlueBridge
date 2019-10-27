import java.util.Scanner;

public class Muniu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] a = new int[20];
		int count=0;
		while(true) {
			int i = input.nextInt();
			if(i!=0) {
				a[count]=i;
				count++;
			}
			else {
				break;
			}
		}
		input.close();
		
		for(int j=0;j<count;j++) {
			System.out.println(muniu(a[j]));
		}
		
	}
	public static int muniu(int n) {
		if(n<=4) {
			return n;
		}else {
			return muniu(n-1)+muniu(n-3);
		}
	}

}
