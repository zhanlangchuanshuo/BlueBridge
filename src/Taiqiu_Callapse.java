import java.util.Scanner;

public class Taiqiu_Callapse {
	
	                         //速度分量，长/宽，总时间，角度，横坐标或纵坐标
	public static double S_ru(double v,int l,int t,int a,int xoy,int r) {
		double tl = t-(l-xoy-r)/(v);
		double T = (l-2*r)/v;
		if(tl>=0) {
			int n = (int) (tl/T);
			if(n%2 == 1) {
				return r+(tl%T)*v;
			}
			else {
				return l-r-(tl%T)*v;
			}
		}
		return xoy+t*v;
	}
	
	public static double S_ld(double v,int l,int t,int a,int xoy,int r) {
		double tl = t- (xoy-r)/v;
		double T = (l-2*r)/v;
		if(tl >=0) {
			int n = (int) (tl/T);
			if(n%2 == 1) {
				return l-r-(tl%T)*v;
			}else {
				return r+(tl%T)*v;
			}
		}return xoy-v*t;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int L,W,a,v,t,r,x,y;
		double Sx = 0,Sy = 0;
		L = input.nextInt();
		W = input.nextInt();
		x = input.nextInt();
		y = input.nextInt();
		r = input.nextInt();
		a = input.nextInt();
		v = input.nextInt();
		t = input.nextInt();
		
		
		if(Math.sin(a)>0) {
			Sy = S_ru(Math.abs(v*Math.sin(a)),W,t,a,y,r);
			
		}
		if(Math.sin(a)<0) {
			Sy = S_ld(Math.abs(v*Math.sin(a)),W,t,a,y,r);
		}
		if(Math.cos(a)>0) {
			Sx = S_ru(Math.abs(v*Math.cos(a)),L,t,a,x,r);
		}
		if(Math.acos(a)<0) {
			Sx = S_ld(Math.abs(v*Math.cos(a)),L,t,a,x,r);
		}if(a==0 || a==180) {
			Sy = y;
		}if(a == 90 || a == 270) {
			Sx = x;
		}
		System.out.println(a==180);
		System.out.println(Sx);
		System.out.println(Sy);
		
		
		
	}

}
