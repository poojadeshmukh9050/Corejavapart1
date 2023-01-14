package oops;

import java.util.Scanner;

class Addition{
	int a,b;
	Scanner c=new Scanner(System.in);
	
	void add()
	{
		System.out.println("value of a and b:");
		a=c.nextInt();
		b=c.nextInt();
		int sum = a+b;
		System.out.println("add is"+sum);
	}
}

class Subtraction extends Addition{
	int a,b;
	Scanner c=new Scanner(System.in);
	
	void sub()
	{
		System.out.println("value of a and b:");
		a=c.nextInt();
		b=c.nextInt();
		int sub = a-b;
		System.out.println("sub is"+sub);
	}
}
public class AdditonInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Subtraction s=new Subtraction();
    s.add();
    s.sub();
	}

}
