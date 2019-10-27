import java.util.Scanner;

public class Gaiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		while(input.hasNext()) {
			String s = input.next();
			count = isRight(s,count);
		}System.out.print(count);
		input.close();
	}
	public static int isRight(String s,int count) {
		if(!s.contains("?")) {
			int index = s.indexOf("+");
			if(index!=-1) {
				//加法运算
				int denghao = s.indexOf("=");
				int a = Integer.parseInt(s.substring(0,index));
				int b = Integer.parseInt(s.substring(index+1,denghao));
//				System.out.println(a+" "+b);
				int c = Integer.parseInt(s.substring(denghao+1,s.length()));
				if(a+b==c) return ++count;
			}else {
				//减法运算
				index = s.indexOf("-");
				int denghao = s.indexOf("=");
				int a = Integer.parseInt(s.substring(0,index));
				int b = Integer.parseInt(s.substring(index+1,denghao));
//				System.out.println(a+" "+b);
				int c = Integer.parseInt(s.substring(denghao+1,s.length()));
				if(a-b==c) return ++count;
			}
		}
		return count;
	}

}
