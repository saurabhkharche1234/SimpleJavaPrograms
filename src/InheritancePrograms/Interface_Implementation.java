//interface program in java
// the methods declared in the interface must be implemented by any class that implements the interface
// interfaces can be used to define contracts that classes must follow, promoting consistency and maintainability
//multiple inheritance can be achieved using interfaces in java
package InheritancePrograms;
import java.util.Scanner;

interface area{
	public void dimensions();
	public void area();
}


public class Interface_Implementation implements area{

	int l,b,area;
	public void dimensions()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		l = sc.nextInt();
		System.out.println("Enter the breadth");
		b = sc.nextInt();
	}
	public void area()
	{
		area = l*b;
		System.out.println("Area::"+area);
	}
	
	public static void main(String[] args) {
		
		Interface_Implementation obj = new Interface_Implementation();
		obj.dimensions();
		obj.area();
	}

}
