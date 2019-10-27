import java.util.Scanner;

public class Xunhuanquchu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		int index=0,count=0;
		boolean[] a = new boolean[n];
		for(int i=0;i<a.length;i++) a[i] = true;
		
		for(int j=0;j<a.length-1;j++){
			//向后数两个合法的、存在的
			do {
				index = (index+1)%a.length;
			}while(!a[index]);
			do {
				index = (index+1)%a.length;
			}while(!a[index]);
			
			//将该位置的对象去除
			a[index] = false;
			//寻找下一个合适的位置
			do {
				index = (index+1)%a.length;
			}while(!a[index]);
			count++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]) {
				System.out.println(i+1);
				break;
			}
		}
	}
	
	
	
	

}
