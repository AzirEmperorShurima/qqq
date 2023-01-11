package p2560;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("source4.txt"));
			PrintStream ps = new PrintStream(new File("dest4.txt"));
			int dong=0;
			double sum=0; 
			while(sc.hasNextDouble()) {
				dong++;
				sum += sc.nextDouble();
			}
			ps.println("Trung binh: " + sum/dong);
			System.out.println("Da sao chep thanh cong");
			sc.close();
			ps.close();
		} catch(Exception e) {
			System.err.println("Loi " + e.getMessage());
		}

	}

}
