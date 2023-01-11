package p2560;

import java.util.Scanner;

public class bai5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		s1 = sc.nextLine();
		
		String s2;
		s2 = sc.nextLine();
		int indexOfA = s1.indexOf(s2);
		if(indexOfA == -1)
			System.out.println("Substring not found in the string");
		else 
			System.out.println("Substring found at position " + (indexOfA+1) + " in the string");
		

	}

}
