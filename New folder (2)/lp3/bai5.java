package p2560;

import java.util.Arrays;

public class bai5 {
	int[] arr = new int[0];
	void add(int element) 
	{
		int[] m = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) 
		{
			m[i] = arr[i];
		}
		m[arr.length] = element;
		arr = m;
	}
	
	public String toString() 
	{
		String result = "[";
		for(int i=0; i<arr.length; i++)
			if(i == arr.length-1) 
			{
				result += arr[i] + "]";
			}else {
				result += arr[i] + ", ";
			}
		return result;
	}
	
	void reverse() {
		for(int i=arr.length-1; i>=0; i--) 
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public void reverse1() 
	{
		int temp;
		for(int i=0; i<arr.length/2; i++) 
		{
			temp = arr[arr.length-1-i];
		 	arr[arr.length-i-1] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		bai5 b = new bai5();
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
		b.reverse1();
	}

}
