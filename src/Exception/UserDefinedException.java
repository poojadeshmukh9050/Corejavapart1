package Exception;

import java.util.Scanner;

class MinimumBalance extends Exception{
	String name;
	public MinimumBalance(String name) {
		this.name=name;
		
	}
	@Override
	public String toString() {
		return name;
	}
}
public class UserDefinedException {
 static double Current_balance=100;
	public static void main(String[] args) throws MinimumBalance {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter amount to Withdrawal");
    int n=sc.nextInt();
    try {
	if(Current_balance<n) {
		throw new MinimumBalance ("Insufficient funds! your current balance is"+Current_balance);
	}
	else {
		System.out.println("please take the money:"+n);
		
	}
    }catch(MinimumBalance mab) {
	mab.printStackTrace();
}
	}

}
