package Date_Time_Year;
import java.util.Scanner;
public class Year_Week_Day {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m, year, week, day;
		
		System.out.println("Enter the number of days:");
		m = sc.nextInt();
		
		year = m / 365;
		m = m % 365;
		System.out.println("No of years: "+year);
		
		week = m/7;
		m = m%7;
		System.out.println("No. of Weeks: "+week);
		
		day = m;
		System.out.println("No. of days: "+day);
	}

}
