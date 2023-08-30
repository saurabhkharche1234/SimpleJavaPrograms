//runnable implementation
package multithreading;

class Example implements Runnable{
	public void run() {
		System.out.println("Thread using runnable "+Thread.currentThread().getName());
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
		Thread obj = new Thread(new Example());  //when we implement runnable we have to create object like this
		obj.start();
	}

}
