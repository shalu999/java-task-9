package Assignment2;

import java.util.Scanner;

public class PallindromeForloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.nextLine();

		for (int i = 0, j = word.length() - 1; i < j; i++, j--)

		{
			if (word.charAt(i) != word.charAt(j)) {
				System.out.println("The word is not pallindrome");
				break;
			}

		}
		System.out.println("pallindrome");
	}

}
