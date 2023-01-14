package basicprogram;

import java.util.Scanner;

public class Evenoddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the number:");
		n =s.nextInt();
		if(n%2==0)
		{
			System.out.println("Even number:"+n);
			
		}
		else
		{
			System.out.println("odd number:"+n);
			
		}
	}

}
