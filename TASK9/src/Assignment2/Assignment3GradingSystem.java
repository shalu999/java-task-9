package Assignment2;

import java.util.Scanner;

public class Assignment3GradingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if (marks == 100) {
			System.out.println("Grade S");
		} else {

			switch (marks / 10) {

			case 10:

			case 9:
				System.out.println("Grade A");
			case 8:
				System.out.println("Grade B");
				break;
			case 7:
				System.out.println("Grade c");
				break;
			case 6:
				System.out.println("Grade d");
				break;
			case 5:
				System.out.println("Grade e");
				break;

			case 4:

				System.out.println("Grade f");
				break;

			default:

				System.out.println("Invalid input");
				break;

			}
		}
	}
}
