package p2560;

import java.util.Arrays;

public class bai4 {
	int[] arr = new int[0];
	void add(int element) 
	{
		int[] m = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) 
		{
			m[i] = arr[i];
		}
		m[arr.length]=element;
		arr=m;
	}
	
	public String toString() 
	{
		String result = "[";
		for(int i=0; i<arr.length; i++)
		{
			if(i==arr.length-1)
				result += arr[i] + "]";
			else
				result += arr[i] + ", ";
		}
		return result;
	}
	
	void sum() 
	{
		int sum=0, count=0;
		for(int i=0; i<arr.length; i++) 
		{
			sum += arr[i];
		}
		float average = (float)sum/arr.length; 
		System.out.println("Sum = " + average);
		
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i] > average)
				count++;
		}
		System.out.println("Co " + count + " so cao hon gia tri trung binh");
	}
	
	public static void main(String[] args) {
	bai4 b = new bai4();
	
	b.add(5);
	b.add(4);
	b.add(1);
	b.add(2);
	b.add(3);
	b.add(2);
	b.add(4);
	b.add(1);
	b.add(7);
	b.add(3);
	
	System.out.println(b.toString());	
	b.sum();
	}

}
