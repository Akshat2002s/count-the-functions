import java.util.*;
public class Example {
	String depositer;
	String accno;
	String type;
	long balance;
	
	public Example(){
		depositer="Member1";
		accno="1";
		type= "Savings Account";
		balance= 2000;
	}
	void deposit(int a) {
		balance= a;
		System.out.println("Amount deposited= "+balance);
	}
	void withdraw(int b) {
		if((long)b<balance) {
			System.out.println("Amount withdrawn= "+b);
			balance=balance-(long)b;
			System.out.println("Remaining balance= "+balance);
		}
		else
			System.out.println("You don't have enough balance");
	}
	void display() {
		System.out.println("The name of the accoubt holder is "+depositer);
		System.out.println("The balance in the account is "+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj=new Example();
		obj.deposit(6000);
		obj.withdraw(3000);
		obj.display();

	}

}
