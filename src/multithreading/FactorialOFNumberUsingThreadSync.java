package multithreading;
import java.util.Scanner;
class Factorial{
	public void facto(int n) {
		int ans =1;
		synchronized (this) {
			for(int i=n;i>1;i--) {
				ans = ans *i;
				System.out.print(ans+"  ");
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}	
			}
			System.out.println();
		}
	}
}

class class1 extends Thread{
	Factorial f;
	class1(Factorial f){
		this.f = f;
	}
	public void run() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of factorial::");
			int num =  sc.nextInt();
			f.facto(num);
		}
		
	}
}

class class2 extends Thread{
	Factorial f1;
	class2(Factorial f1){
		this.f1 = f1;
	}
	public void run() {
		System.out.println("Now this thread will be executed first as class1 is taking input from user");
		f1.facto(8);
	}
	
}

public class FactorialOFNumberUsingThreadSync {

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		class1 c1 = new class1(obj);
		class2 c2 = new class2(obj);
		c1.start();
		c2.start();
	}

}
