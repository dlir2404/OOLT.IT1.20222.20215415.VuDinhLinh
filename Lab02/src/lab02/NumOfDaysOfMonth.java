package lab02;

import java.util.Scanner;
public class NumOfDaysOfMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isInputValid = false;
		int month = 0, year = 0;
		while (!isInputValid) {
			System.out.println("Enter month: ");
			month = sc.nextInt();
			if (month < 1 || month >12) {
				System.out.println("Invalid month!");
				continue;
			}
			
			System.out.println("Enter year: ");
			year = sc.nextInt();
			if(year < 0) {
				System.out.println("Invalid year!");
				continue;
			}
			isInputValid = true;
		}
		int days = 0;
		switch (month){
			case 2: 
				if ((year%4 == 0 && year%100 != 0)||year%400 == 0)
					days = 29;
				else days = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			default: 
				days = 31;
				break;
		}
		
		System.out.println("This month has " + days + " days");	
		sc.close();
	}
}

