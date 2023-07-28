//in method overriding to print the original method you have to create
//object of the original class
package InheritancePrograms;

 class MethodOverriding {
	
	void showme()
	{
		System.out.println("This is Base class message");
		
	}
 }
 
	class MethodOverriding1 extends MethodOverriding
	{
		void showme()
		{
			System.out.println("Method of base class is overridden");
		}
		public static void main(String[] args) {
			MethodOverriding1 obj = new MethodOverriding1();
			obj.showme();
		}
		
	}
