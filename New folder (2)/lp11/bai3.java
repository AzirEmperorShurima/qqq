package p2560;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("source3.txt"));
			PrintStream ps = new PrintStream(new File("dest3.txt"));
			int dong=0;
			while(sc.hasNextLine()) {
				sc.nextLine();
				dong++;
			}
			ps.println("So dong: " + dong);
			System.out.println("Da sao chep thanh cong");
			sc.close();
			ps.close();
		} catch(Exception e) {
			System.err.println("Loi " + e.getMessage());
		}

	}

}
