package ExceptionsBasic;
// try block is used along with finally block
public class Try_Finally {

	public static void main(String[] args) {
		try {
			int divideByZero = 5/0;
			
		}
		finally {
			System.out.println("Finally block is always executed");
		}

	}

}
