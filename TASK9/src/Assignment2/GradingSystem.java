package Assignment2;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Welcome to Anna University Grading System");
	        System.out.println("Enter the mark:");
	        int mark = scanner.nextInt();
	        
	        String grade = c(mark);
	        
	        System.out.println("Your grade is: " + grade);
	        
	        scanner.close();
	    }
	    
	    public static String c(int mark) {
	        if (mark == 100) {
	            return "S";
	        } else if (mark >= 90 && mark <= 99) {
	            return "A";
	        } else if (mark >= 80 && mark <= 89) {
	            return "B";
	        } else if (mark >= 70 && mark <= 79) {
	            return "C";
	        } else if (mark >= 60 && mark <= 69) {
	            return "D";
	        } else if (mark >= 50 && mark <= 59) {
	            return "E";
	        } else {
	            return "F";
	        }
	    }
	}

