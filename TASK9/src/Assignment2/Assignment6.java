package Assignment2;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month from 1-12");
		int month = sc.nextInt();
		System.out.println("Enter the room rent");
		float roomrent = sc.nextFloat();
		System.out.println("Enter the number of days");
		int days = sc.nextInt();

		double traffic;
		switch (month) {
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			traffic = roomrent * days * 1.20;//calculating the traffic for 20% increase
			System.out.println(traffic);
			break;

		default:
			traffic = roomrent * days;//Normal months traffic

		}

		System.out.printf("Hotel tariff: %.2f\n", traffic);

	}

}
