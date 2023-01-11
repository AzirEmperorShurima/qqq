package p2560;

import java.util.Scanner;

public class bai9 {
	float x;
//	float e=0;
	double eps;
	
	void inPut() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x(radian): ");
		x = sc.nextFloat();
		System.out.print("Enter Epsilon: ");
		eps = sc.nextDouble();
	}
	
	void xuLi() {
		int i=1;
		float t;
		float e=0;
		
		t=e=x;
		while(Math.abs(t) > eps) {
			i += 2;
			t *= x*x/i/(i-1);
			e += (i%4==1) ? t : -t;
		}
		System.out.println("Sin(" + x + ") = " + e);
	}
	
	public static void main(String[] args) {
		bai9 b = new bai9();
		b.inPut();
		b.xuLi();

	}

}
