//Program to check whether the given year is leap year or not

package Date_Time_Year;
import java.util.Scanner;
public class Check_Leap_Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		boolean flag = false;
		
		if(year%400==0)
		{
			flag = true;
		}
		else if(year % 100 == 0)
		{
			flag = false;
		}
		else if(year % 4 == 0)
		{
			flag = true;
		}
		else 
		{
			flag = false;
		}
		
		if(flag)
		{
			System.out.println("Leap Year");
		}
		else 
			System.out.println("Not a leap Year");

	}

}
