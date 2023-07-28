package InheritancePrograms;
class Parent{
	void get()
	{
		System.out.println("Base class method using super keyword");
		
	}
	
}
public class Child1 extends Parent {
	void get()
	{
		super.get();
		System.out.println("Child Class method");
	}
	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.get();
	}
}
