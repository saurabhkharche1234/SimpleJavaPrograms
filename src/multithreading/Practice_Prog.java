package multithreading;

class A{}
class B{}

public class Practice_Prog {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized(obj1) {
					System.out.println("Inside obj1");
					synchronized (obj2) {
						System.out.println("Inside obj1's obj2");
						
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (obj2) {
					System.out.println("Inside obj2");
					synchronized (obj1) {
						System.out.println("Inside obj2's obj1");
					}
					
				}
			}
		};
		t1.start();
		t2.start();
	}

}
