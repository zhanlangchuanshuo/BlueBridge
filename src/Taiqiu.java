import java.util.Scanner;

public class Taiqiu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int L,W,x,y,r,a,v,s;
		L = input.nextInt();
		W = input.nextInt();
		x = input.nextInt();
		y = input.nextInt();
		r = input.nextInt();
		a = input.nextInt();
		v = input.nextInt();
		s = input.nextInt();
		while(isStop(L,W,x,y,r,a,v,s)) {
			calculate(L,W,x,y,r,a,v,s);
			L = input.nextInt();
			W = input.nextInt();
			x = input.nextInt();
			y = input.nextInt();
			r = input.nextInt();
			a = input.nextInt();
			v = input.nextInt();
			s = input.nextInt();
		}
		
		input.close();	
	}
	public static boolean isStop(int L,int W,int x,int y,int r,int a,int v,int s) {
		int count=0;
		if(L==0) count++;
		if(W==0) count++;
		if(x==0) count++;
		if(y==0) count++;
		if(r==0) count++;
		if(a==0) count++;
		if(v==0) count++;
		if(s==0) count++;
		if(count==8) return false;
		return true;
	}
	public static void calculate(int L,int W,int x,int y,int r,int a,int v,int s) {
		//����ˮƽ����ֱ�ٶ�
				double vx = Math.abs(v*Math.cos(Math.toRadians(a)));
				double vy = Math.abs(v*Math.sin(Math.toRadians(a)));
				
				//����ˮƽ����ֱ�������˶��ľ���
				double sx = vx * s;
				double sy = vy * s;
//				System.out.println("sx="+sx+" sy="+sy);
				//��ʼ������λ�ñ���
				double x1=x,y1=y;
				
				if(Math.abs(Math.cos(Math.toRadians(a)))>1e-6) {
					//�о�ˮƽ����
					int fangxiang = (int)(sx/(L-2*r));
					double pianli = sx%(L-2*r);
//					System.out.println("����"+fangxiang+"  ƫ��:"+pianli);
					if(fangxiang%2==1) {
						//���µĵ�Ļ�������ԭ���ķ����෴
						x1 = L-x+(-1.0)*(Math.cos(Math.toRadians(a))/Math.abs(Math.cos(Math.toRadians(a))))*pianli;
						if(x1>(L-r)) {
							x1 = (L-r)-(x1-(L-r));
						}if(x1<r) {
							x1 = r+(r-x1);
						}
					}else {
						//��ԭ����Ļ�������ԭ����ͬ�ķ���
						x1 = x+(Math.cos(Math.toRadians(a))/Math.abs(Math.cos(Math.toRadians(a))))*pianli;
						if(x1>(L-r)) {
							x1 = (L-r)-(x1-(L-r));
						}if(x1<r) {
							x1 = r+(r-x1);
						}
					}
				}
				if(Math.abs(Math.sin(Math.toRadians(a)))>1e-6) {
					//�о���ֱ����
					int fangxiang = (int)(sy/(W-2*r));
					double pianli = sy%(W-2*r);
//					System.out.println("����"+fangxiang+"  ƫ��:"+pianli);
					if(fangxiang%2==1) {
						//���µĵ���ԭ�������෴
						y1 = W-y+(-1.0)*(Math.sin(Math.toRadians(a))/Math.abs(Math.sin(Math.toRadians(a))))*pianli;
						if(y1>(W-y)) {
							y1 = (W-y)-(y1-(W-y));
						}
						if(y1<r) {
							y1 = r+(r-y1);
						}
					}else {
						//��ԭ������ԭ��������ͬ
						y1 = y+(Math.sin(Math.toRadians(a))/Math.abs(Math.sin(Math.toRadians(a))))*pianli;
						if(y1>(W-y)) {
							y1 = (W-y)-(y1-(W-y));
						}
						if(y1<r) {
							y1 = r+(r-y1);
						}
					}
				}
				System.out.println(String.format("%.2f %.2f", x1,y1));
	}
	

}