package Special_Programs;

public class Test {
public static void main(String[] args) 
{
// Create an object of class Person.
   Person p =  new Person();
// Call setter methods and set the values.
   p.setName("Jack");
   p.setAge(20);
   
// Call getter methods.
   String n = p.getName();
   int a = p.getAge();
// Print name and age on the console.
   System.out.println("Name: " +n);
   System.out.println("Age: " +a);
	}
}