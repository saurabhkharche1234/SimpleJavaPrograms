//program to illustrate how user authentication is done

package Special_Programs;
import java.util.Scanner;
public class User_Authentication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String username, password;
		System.out.println("Enter Username:");
		username = sc.nextLine();
		System.out.println("Enter Password");
		password = sc.nextLine();
		
		if(username.equals("Uchiha") && password.equals("Naruto@123"))
		{
			System.out.println("Authentication successful");
		}
		else
		{
			System.out.println("Authentication failed");
		}

	}

}
