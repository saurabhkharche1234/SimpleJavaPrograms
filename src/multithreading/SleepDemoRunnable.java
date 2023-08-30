package multithreading;

class Demo implements Runnable{
	public void run() {
		System.out.println("This is run method");
		try{
			Thread.sleep(1000);
			System.out.println("Thread is sleeping for 1 sec");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class SleepDemoRunnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Demo());	
		
		t1.start();
	}
}