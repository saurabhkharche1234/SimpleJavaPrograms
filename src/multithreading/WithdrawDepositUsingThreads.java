//if we do not close the scanner block with sc.close() then it throws warning not error
//if we surround scanner with try block then it will not throw error.
//so we can either close scanner block or we can surround scanner block with try block

package multithreading;

import java.util.Scanner;

class Customer{
	int amount = 10000;
	synchronized void withdrawl(int withdraw) {
		if(this.amount<withdraw) {
			System.out.println("Low balance, waiting for deposit..");
			try {
				wait();
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		if(this.amount == withdraw || this.amount > withdraw) {
			this.amount -= withdraw;
		}
		System.out.println("balance after withdrawl"+amount);
	}
	
	synchronized void deposit(int withdraw) {
		System.out.println("Adding balance..");
		this.amount += withdraw;
		System.out.println("Balance after deposit is:: "+amount);
		notify();
	}
}

public class WithdrawDepositUsingThreads {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount to withdraw");
			int withdraw = sc.nextInt();
			final Customer c = new Customer();
			System.out.println("Enter amount to deposit");
			int deposit = sc.nextInt();
			new Thread() {
				public void run() {
					c.withdrawl(withdraw);
				}
			}.start();
			
			new Thread() {
				public void run() {
					c.deposit(deposit);
				}
			}.start();
			sc.close();
		}
	}

