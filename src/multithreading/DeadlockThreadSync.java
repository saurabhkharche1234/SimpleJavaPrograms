//this is the example of deadlock where output:: requesting will not be printed
package multithreading;

class Pen{}
class Paper{}

public class DeadlockThreadSync {

	public static void main(String[] args) {
		final Pen pen = new Pen();
		final Paper ppr = new Paper();
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (pen) {
					System.out.println("Thread t1 is holding pen");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {}
					synchronized (ppr) {
						System.out.println("Requesting for paper");
					}
				}
			}
		};
		Thread t2 = new Thread() {
		public void run(){
			synchronized (ppr) {
				System.out.println("Thread t2 is holding paper");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {}
			synchronized (pen) {
				System.out.println("Requesting for pen");
			}	
			}
			}
		};
		t1.start();
		t2.start();
		
	}
}
