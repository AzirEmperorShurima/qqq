package p2560;

import java.util.Scanner;

public class bai2 {
	String in;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		in = sc.nextLine();
	}
	
	boolean checkNumber()
	{
		Scanner sc = new Scanner(in);
		while(!sc.hasNext())
		{
			if(sc.hasNextDouble())
				return false;
		}
		return true;
	}
	
	double sumString()
	{
		double sum = 0;
		Scanner sc = new Scanner(in);
		while(sc.hasNext())
		{
			sum += Math.pow(sc.nextDouble(), 2);
		}
		return sum;
	}
		
	public static void main(String[] args) {
		bai2 b = new bai2();
		b.input();
		 
        if(b.checkNumber())
        {
        	System.out.println("is valid");
        	System.out.println("square sum: " + b.sumString());
        }
        else 
        {
        	System.out.println("invalid");
        	System.out.println("N/A");
        }
		
	}

}
