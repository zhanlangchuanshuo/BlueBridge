import java.util.Scanner;

/*
 * 汽水瓶兑换汽水瓶数的计算
 * 商店规定：三个空汽水瓶可以换一瓶汽水
 * 假设手头有10个瓶子，最多可以换多少瓶
 * 首先每三个空瓶子可以换一瓶，第一次先换三瓶，喝完后还剩四个瓶子
 * 再换一瓶，喝完后还剩下两个瓶子，这时再问店家借一瓶汽水，喝完后还他三个瓶子走人
 * 写一个程序，输入一个正整数n，表示空瓶子个数，计算最多可以兑换多少瓶汽水
 * 输入：输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数（1<=n<=100),n=0表示输入结束
 * 输出：对于每组测试数据，输出一行，表示最多可以喝到的汽水瓶数，如果一瓶也喝不到，输出0
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
