package p2560;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("source2.txt"));
			PrintStream ps = new PrintStream(new File("dest2.txt"));
			int soNguoi=0;
			int soNguoi1=0;
			while(sc.hasNext()) {
				if(sc.hasNextInt())
					soNguoi = sc.nextInt();
				else
					sc.next();
			}
			soNguoi1=soNguoi + 1;
			ps.println("You are visitor number " + soNguoi);
			ps.println("You are visitor number " + soNguoi1);
			System.out.println("Da sao chep thanh cong");
			sc.close();
			ps.close();
		} catch(Exception e) {
			System.err.println("Loi " + e.getMessage());
		}

	}

}
