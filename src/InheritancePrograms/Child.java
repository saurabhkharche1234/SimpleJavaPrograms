//java program to use super and this keyword
package InheritancePrograms;
class Base1{
	
	int x= 10;
}

class Base2 extends Base1{
	int x = 20;
	
}
public class Child extends Base2 {
	int x = 30;
	void show()
	{
		System.out.println("Child class-"+x);
		System.out.println("Base2 class-"+super.x);
		System.out.println("Accessing value of data member via this Keyword::");
		System.out.println("Base1 class- "+(((Base1)this).x));
	}
	public static void main(String[] args) {
		Child obj = new Child();
		obj.show();

	}

}
