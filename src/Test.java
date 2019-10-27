import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			String[][] s = new String[a][a];
			//1¸ö´óX
			for(int j=0;j<a;j++) {
				for(int k=0;k<a;k++) {
					if(j==k || j+k==a-1) {
						s[j][k]="X";
					}else {
						s[j][k]=" ";
					}
				}
			}
			//ÖØ¸´X
			for(int c=0;c<b;c++) {
				
			}
			
			for(int x=0;x<a;x++) {
				for(int y=0;y<a;y++) {
					System.out.print(s[x][y]);
				}
				System.out.println();
			}
		}
		
				
	}
	
}
