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
			//����������Ϸ��ġ����ڵ�
			do {
				index = (index+1)%a.length;
			}while(!a[index]);
			do {
				index = (index+1)%a.length;
			}while(!a[index]);
			
			//����λ�õĶ���ȥ��
			a[index] = false;
			//Ѱ����һ�����ʵ�λ��
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
