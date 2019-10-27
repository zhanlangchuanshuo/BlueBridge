import java.util.Scanner;
public class CountT_or_F {
	
	public static boolean isTrue(String s) {
		if(s.charAt((s.length()-1))=='?') {
			return false;
		}
		int jiahao = s.indexOf('+');
		int jianhao = s.indexOf('-');
		int dengyu = s.lastIndexOf('=');
		int result = Integer.valueOf(s.substring(s.lastIndexOf('=')+1));

		if(jiahao != -1) {
			if(Integer.valueOf(s.substring(0, jiahao)) + 
					Integer.valueOf(s.substring(jiahao+1, dengyu))
					== result) {
				return true;
			}
		}
		else {
			if(Integer.valueOf(s.substring(0,jianhao))-
					Integer.valueOf(s.substring(jianhao+1, dengyu))
					== result) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		String s = input.nextLine();
		while(true) {
			if(s.equals("")) {
				break;
			}else {
				if(isTrue(s)) {
					count++;
				}
			}
			s = input.nextLine();
		}
		System.out.println(count);
		input.close();

	}

}
