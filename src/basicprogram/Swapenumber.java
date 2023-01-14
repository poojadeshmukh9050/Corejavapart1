package basicprogram;

import java.util.Scanner;

public class Swapenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter the value of x and y");
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    System.out.println("Before swapping numbers:"+x+""+y);
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("After swapping numbers:"+x+""+y);
	}

}
