package ExceptionsBasic;
//in java we can use try block without a catch block. however we cannot use a catch block without a try block
public class Try_Catch {

	public static void main(String[] args) {
		try {
			int divideByZero = 5/0; //when the prog encounters this code ArithmeticException occurs
			System.out.println("Code is in try block");
		}
		catch(ArithmeticException e) {   //exception is caught by catch block and executes the code inside catch block
			System.out.println("Arithmetic Exception "+ e.getMessage());
		}  //catch block is only executed if there exists an exception inside try block

	}

}
