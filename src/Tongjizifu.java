import java.util.Scanner;

public class Tongjizifu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		int[] r = tongji(s);
		for(int i=0;i<4;i++) {
			if(i==3) System.out.print(r[i]+"");
			else System.out.print(r[i]+" ");
		}
	}
	public static int[] tongji(String s) {
		int yingwen=0,shuzi=0,kongge=0,qita=0;		
		//转化为字符数组进行判断
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				shuzi++;
			}
			else if((ch[i]>='A' && ch[i]<='Z') || (ch[i]>='a' && ch[i]<='z')) {
				yingwen++;
			}
			else if(ch[i] == ' ') {
				kongge++;
			}else {
				qita++;
			}
		}
		int[] r = new int[4];
		r[0] = yingwen;
		r[1] = shuzi;
		r[2] = kongge;
		r[3] = qita;
		return r;
	}

}
