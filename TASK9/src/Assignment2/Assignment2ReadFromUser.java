package Assignment2;

import java.util.Scanner;

public class Assignment2ReadFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.nextLine();
		String reversedword = " ";//initializing the reversed word  as 'null'
		char ch;
		for (int i = 0; i < word.length(); i++) {
			ch = word.charAt(i);//storing the character at index position to 'ch'
			// System.out.println(ch);
			reversedword = ch + reversedword;//reversing the word 

		}
		System.out.println("Reversed string  " + reversedword);
	}
}
