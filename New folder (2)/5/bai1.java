package p2560;

import java.util.Scanner;

public class bai1 {
	int n;
	String b;
	
	void inPut()
	{
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
	}
	
	void printB(int n)
	{
		double k;
		b = "";
		while(n != 0) {
			k = (double)n/2;
			if(Math.ceil(k) != Math.floor(k))
				b = "1" + b;
			else
				b = "0" + b;
			n = n/2;
		}
		System.out.println(b);
	}
	
	void number_to_word(int n)
	{
		int temp;
		String c = "";
		while(n != 0) {
			temp = n%10;
			n /= 10;
			switch (temp) {
			case 0:
				c =  "zero " + c;
				break;
			case 1:
				c =  "one " + c;
				break;
			case 2:
				c =  "two " + c;
				break;
			case 3:
				c =  "three " + c;
				break;
			case 4:
				c =  "four " + c;
				break;
			case 5:
				c =  "five " + c;
				break;
			case 6:
				c =  "six " + c;
				break;
			case 7:
				c =  "seven " + c;
				break;
			case 8:
				c =  "eight " + c;
				break;
			case 9:
				c =  "nine " + c;
				break;
			}
		}
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		bai1 b = new bai1();
		b.inPut();
		b.printB(b.n);
		b.number_to_word(b.n);

	}

}
