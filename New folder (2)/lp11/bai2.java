package p2560;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("source2.txt"));
			PrintStream ps = new PrintStream(new File("dest2.txt"));
			String s = sc.nextLine();
			for(int i = 0; i<s.length(); i++) {
				ps.println((i+1) + ": " + s.charAt(i));
			}
			System.out.println("Da sao chep thanh cong");
			sc.close();
			ps.close();
		} catch(Exception e) {
			System.err.println("Loi " + e.getMessage());
		}

	}

}
