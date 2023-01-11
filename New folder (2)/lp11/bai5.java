package p2560;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("source2.txt"));
			PrintStream ps = new PrintStream(new File("dest2.txt"));
			while(sc.hasNext()) {
				ps.println(sc.nextLine());
				ps.println();
			}
			System.out.println("Da sao chep thanh cong");
			sc.close();
			ps.close();
		} catch(Exception e) {
			System.err.println("Loi " + e.getMessage());
		}

	}

}
