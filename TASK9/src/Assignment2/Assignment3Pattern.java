package Assignment2;

import java.util.Scanner;

public class Assignment3Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int number=1;
		for (int i=1 ; i<=rows;i++)
		
		{
			for(int j=1;j<=i;j++) {
		System.out.print(number+ "");
		number++;
			}
				
			System.out.println();
				
			}
		}
		

	}


