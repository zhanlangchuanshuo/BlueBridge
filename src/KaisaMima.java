import java.util.Scanner;

public class KaisaMima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
//			ch[i] = (char) (ch[i] + 4);
			if(ch[i]<92) {
				ch[i] = (char)('A'+(ch[i]-'A'+4)%26);
			}else {
				ch[i] = (char)('a'+(ch[i]-'a'+4)%26);
			}
		}
//		for(int i=0;i<ch.length;i++) {
//			System.out.print(ch[i]+"");
//		}
		System.out.println(String.valueOf(ch));
	}

}
