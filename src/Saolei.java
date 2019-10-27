import java.util.Scanner;

public class Saolei {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		while(m!=0&&n!=0) {
			//首先获取得到雷区的表示
			char[][] field = new char[m][n];
			for(int i=0;i<m;i++) {
				String s = input.next();
				char[] c = s.toCharArray();
				for(int j=0;j<n;j++) {
					field[i][j] = c[j];
				}
			}
			jieguo(field);
//			for(int i=0;i<m;i++) {
//				for(int j=0;j<n;j++) {
//					System.out.print(field[i][j]);
//				}System.out.println();
//			}
			m = input.nextInt();
			n = input.nextInt();
		}
		input.close();
	}
	public static void jieguo(char[][] field) {
		//只要遇到*，就向周围增加1
		int[][] sm = new int[field.length][field[0].length];
		//初始化，每个数都为0
		for(int i=0;i<field.length;i++) {
			for(int j=0;j<field[0].length;j++) {
				sm[i][j]=0;
			}
		}
		for(int i=0;i<field.length;i++) {
			for(int j=0;j<field[0].length;j++) {
				if(field[i][j]=='*') {
					needZengjia(sm,i-1,j);
					needZengjia(sm,i+1,j);
					needZengjia(sm,i,j-1);
					needZengjia(sm,i,j+1);
					needZengjia(sm,i-1,j-1);
					needZengjia(sm,i-1,j+1);
					needZengjia(sm,i+1,j-1);
					needZengjia(sm,i+1,j+1);
				}
			}
		}
		
		//打印输出
		for(int i=0;i<field.length;i++) {
			for(int j=0;j<field[0].length;j++) {
				if(field[i][j]=='*') System.out.print("*");
				else System.out.print(sm[i][j]);
			}System.out.println();
		}
	}
	public static void needZengjia(int[][] sm,int a,int b) {
		int m = sm.length;
		int n = sm[0].length;
		if(a>=0&&a<n&&b>=0&&b<m) {
			sm[a][b]++;
		}
	}
}