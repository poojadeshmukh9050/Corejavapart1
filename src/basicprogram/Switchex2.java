package basicprogram;

import java.util.Scanner;

public class Switchex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,b,op;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Two Interger");
    a=scanner.nextInt();
    b=scanner.nextInt();
    System.out.println("Enter an operator");
    op = scanner.next().charAt(0);
    switch(op) {
    case'+':
    	System.out.format("%d+%d=%d\n",a,b,a+b);
    	break;
    default:
    	System.out.println("Invaild");
    }
    
	}

}
