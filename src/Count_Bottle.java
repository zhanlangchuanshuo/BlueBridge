import java.util.Scanner;

/*
 * ��ˮƿ�һ���ˮƿ���ļ���
 * �̵�涨����������ˮƿ���Ի�һƿ��ˮ
 * ������ͷ��10��ƿ�ӣ������Ի�����ƿ
 * ����ÿ������ƿ�ӿ��Ի�һƿ����һ���Ȼ���ƿ�������ʣ�ĸ�ƿ��
 * �ٻ�һƿ�������ʣ������ƿ�ӣ���ʱ���ʵ�ҽ�һƿ��ˮ�������������ƿ������
 * дһ����������һ��������n����ʾ��ƿ�Ӹ��������������Զһ�����ƿ��ˮ
 * ���룺�����ļ�������10��������ݣ�ÿ������ռһ�У�������һ����������1<=n<=100),n=0��ʾ�������
 * ���������ÿ��������ݣ����һ�У���ʾ�����Ժȵ�����ˮƿ�������һƿҲ�Ȳ��������0
 */
public class Count_Bottle {
	
	public static int N(int n) {
		if(n==1) {
			return 0;
		}else if(n==2) {
			return 1;
		}
		return n/3+N(n/3+n%3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		do {
			System.out.println(N(n));
			n = input.nextInt();
		}while(n!=0);
		input.close();
	}

}
