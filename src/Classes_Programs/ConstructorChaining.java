/*In Java, constructor chaining is achieved using the this() keyword,
 *  which is used to call another constructor within the same class,
 *   and the super() keyword,
 *    which is used to call a constructor in the parent class.
 */

package Classes_Programs;

public class ConstructorChaining {
	
	ConstructorChaining()
	{
		this(20);
		System.out.println("default constructor");
	}
	
	ConstructorChaining(int x)
	{
		System.out.println("parameterized constructor with single parameter");
	}
	ConstructorChaining(int x, int y)
	{
		this();
		System.out.println("The two numbers are"+x+" and "+y);
		System.out.println("parameterized constructor with two parameters");
	}
	public static void main(String[] args) {
		
		ConstructorChaining c1 = new ConstructorChaining(10,20);

	}

}
