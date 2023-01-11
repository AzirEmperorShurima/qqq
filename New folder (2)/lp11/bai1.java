package p2560;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("source1.txt"));
			PrintStream ps = new PrintStream(new File("dest1.txt"));
			int dong=1;
			while(sc.hasNext()) {
				ps.println(dong + ": " + sc.nextLine());
				dong++;
			}
			System.out.println("Da sao chep thanh cong");
			sc.close();
			ps.close();
		} catch(Exception e) {
			System.err.println("Loi" + e.getMessage());
		}

	}

}
