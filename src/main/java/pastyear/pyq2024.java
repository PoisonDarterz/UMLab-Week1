package pastyear;

import java.util.Scanner;
class q1a {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int num;
		int cNeg = 0, cPos = 0, cZero = 0;
		do {
			System.out.print("\nEnter a number: ");
			input = sc.next();

			if (input.equals("X")) break;
			else num = Integer.parseInt(input);

			if (num < 0) cNeg++;
			else if (num > 0) cPos++;
			else cZero++;
		} while (true);
		System.out.printf("Count of positive: %d\n", cPos); 
		System.out.printf("Count of negative: %d\n", cNeg); 
		System.out.printf("Count of zeroes: %d", cZero); 
	}
}

class q1b {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 1.0;
		System.out.println("Enter a number: ");
		double input = sc.nextDouble();
		for (double i = 2.0; i <= input; i++) {
			sum += 1/i;
		}
		System.out.printf("Sum of series is: %.6f", sum);
	}
}
		