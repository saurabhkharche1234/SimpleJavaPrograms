//thread example to study the waiting state 

package multithreading;

class NewClass implements Runnable{
	public void run() {
		System.out.println("Into run method");
		
		try {
			Thread.sleep(5000);  //thead sleep for 5 sec
			System.out.println("Thread sleep for 5 sec");   
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class JoinIsAliveUse {

	public static void main(String[] args) {
		Thread t1 = new Thread(new NewClass());
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());//will result false because we have paused t1 using join
		Thread t2 = new Thread(new NewClass());
		t2.start();		//t2 will be executed first 
		System.out.println(t2.isAlive());
		
	}

}
