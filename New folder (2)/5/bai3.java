package p2560;

import java.util.Scanner;

public class bai3 {
	String s;
	void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		s = sc.nextLine();
	}
	
	int sumOfIntegerNumbers()
	{
		int sum = 0;
		Scanner sc = new Scanner(s);
		while(sc.hasNext()) 
		{
			if(sc.hasNextInt()) 
				sum += sc.nextInt();
			else
				sc.next();
		}
		System.out.println("The sum of integer numbers: " + sum);
		return sum;
	}
	
	float sumOfFloatNumbers()
	{
		float sum = 0;
		Scanner sc = new Scanner(s);
		while(sc.hasNext()) 
		{
			if(sc.hasNextFloat() && !sc.hasNextInt())
				sum += sc.nextFloat();
			else
				sc.next();
		}
		System.out.println("The sum of float numbers: " + sum);
		return sum;
	}
	
	String sumOfString()
	{
		String sum = "";
		Scanner sc = new Scanner(s);
		while(sc.hasNext()) 
		{
			if(!sc.hasNextFloat() && !sc.hasNextInt())
				sum += sc.next() + " ";
			else
				sc.next();
		}
		System.out.println("The sum of float numbers: " + sum);
		return sum;
	}
	
	public static void main(String[] args) 
	{
		bai3 s3 = new bai3();
		s3.input();
		s3.sumOfIntegerNumbers();
		s3.sumOfFloatNumbers();
		s3.sumOfString();
	}
}
