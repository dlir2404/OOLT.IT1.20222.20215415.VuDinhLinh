
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class MyDate {
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public MyDate() {
		super();
		LocalDate currentDate = LocalDate.now();
		this.day = currentDate.getDayOfMonth();
		this.month = currentDate.getMonthValue();
		this.year = currentDate.getYear();
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public MyDate (String dmy) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd['th'][ ]uuuu");
		LocalDate date = LocalDate.parse(dmy, formatter);
		this.day = date.getDayOfMonth();
		this.month = date.getMonthValue();
		this.year = date.getYear();
	}
	public boolean IsValidDate() {
		if (month < 1 || month >12)
			return false;
		if (year < 0)
			return false;
		if (day < 1 || day > getDaysInMonth(month, year))
			return false;
		return true;
	}
	public int getDaysInMonth( int month,int  year) {
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
		return days;
	}
	public void accept() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter date (\"Month Day Year\"): ");
		String result = input.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd['th'][ ]uuuu");
		LocalDate date = LocalDate.parse(result, formatter);
		this.day = date.getDayOfMonth();
		this.month = date.getMonthValue();
		this.year = date.getYear();
		input.close();
	}
	public void print() {
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: "+ year);
	}
}
