import java.util.Scanner;

public class Daosanjiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		int[] a = new int[n];
		//先做出第一行
		for(int i=0;i<n;i++) {
			if(i==0) a[i]=1;
			else a[i]=a[i-1]+i+1;
		}
		for(int i=0;i<n;i++) {
			if(i==n-1) System.out.print(a[i]+"");
			else System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				a[j] = a[j]+i+j;
				if(j==n-i-1) System.out.print(a[j]+"");
				else System.out.print(a[j]+" ");
			}
			if(i!=n-1) System.out.println();
		}
	}
	
}
