//extends demo example
package multithreading;

class Mythread extends Thread{
	public void run() {
		System.out.println("this is run method");
	}
}
public class ExtendsDemo {

	public static void main(String[] args) {
		Mythread mt = new Mythread();
		mt.start();
				
	}

}
