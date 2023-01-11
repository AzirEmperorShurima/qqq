package p2560;

import java.io.File;
import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("bai7.txt"));
			while(sc.hasNext()) {
				int count = 0;
				if(count == 0) {
					System.out.println(sc.nextLine() + " " + count + " lan!");
					count++;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
