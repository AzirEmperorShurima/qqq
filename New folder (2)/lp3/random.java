package bt;

import java.util.Random;
import java.util.Scanner;

public class random {
	public static int play(Scanner console, Random rand) {
		 int operands = rand.nextInt(4) + 2;
		 int sum = rand.nextInt(10) + 1;
		 System.out.print(sum);

		 for (int i = 2; i <= operands; i++) {
			 int n = rand.nextInt(10) + 1;
			 sum += n;
			 System.out.print(" + " + n);
		 }
		 System.out.print(" = ");

		 int guess = console.nextInt();
		 if (guess == sum) {
			 return 1;
		 } else {
			 System.out.println("Wrong! The answer was " + sum);
			 return 0;
		 }
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		 Random rand = new Random();

		 // play until user gets 3 wrong
		 int points = 0;
		 int wrong = 0;
		 while (wrong < 3) {
			 int result = play(console, rand); // play one game
			 if (result > 0) {
				 points++;
			 } else {
				 wrong++;
			 }
		 }

		 System.out.println("You earned " + points + " total points.");
	}

}
