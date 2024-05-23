package Assignment2;

import java.util.Scanner;

public class PallindromeAssignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.nextLine();
		int i = 0;
		int j = word.length() - 1;
		while (i < j) {

			if (word.charAt(i) != word.charAt(j)) {
				System.out.println("The word is not pallindrome");
				System.exit(0);
			}
			i++;
			j--;

		}
		
		System.out.println("Pallindrome");

	}

}
