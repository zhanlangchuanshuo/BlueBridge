
public class Shuixianhuashu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				for(int k=0;k<=9;k++) {
					if(100*i+10*j+k==i*i*i+j*j*j+k*k*k) {
						System.out.println(100*i+10*j+k);
					}
				}
			}
		}
	}

}
