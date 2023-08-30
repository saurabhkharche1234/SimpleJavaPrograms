package multithreading;

class Addition extends Thread{
	int total = 0;
	public void run() {
		synchronized (this) {
		for(int i= 0;i<10;i++) {
			total += i;
		}
		
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   }
}

public class WaitAndNotifyFunctions {
	
	public static void main(String[] args) {
			Addition a  = new Addition();
			a.start();
			synchronized(a) {
				try {
				System.out.println("Waiting for thread to complete");
				a.wait();
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("Total is::"+ a.total);
			}
			
	}

}
