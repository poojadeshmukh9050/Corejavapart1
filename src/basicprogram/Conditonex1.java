package basicprogram;

import java.util.Scanner;

public class Conditonex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //  int a = 1;
		//	while(a<=4) {
			//System.out.println("Current value of a is "+a);
		//	a++;
			
		//	}
		    //for(int i=1; i<=5; i++) {
		    	//System.out.println("Value of i "+i);
		    	//}
        
        // do {
        // System.out.println("Current executing index :"+a);
        // a++;
        // } while(a<=1);
	
	   Scanner ob = new Scanner(System.in);
	   int  n=1,a = 1,b=2;
	   while(n!=5)
       System.out.println("Enter your choice."+"\n"+"+ for addition"+"\n"+"- for Sunstraction"+"\n"+"* For Multiplication"+"\n"+"/ For Division");
	   System.out.println("Enter an operator:");
	   char op =ob.next().charAt(0);
	   switch(op) {
	   case '+':
		   System.out.format("%d + %d =%d \n",a,b,a+b);
		   break;
	   case '-':
		   System.out.format("%d - %d =%d \n",a,b,a-b);
		   break; 
	   case '*':
		   System.out.format("%d * %d =%d \n",a,b,a*b);
		   break;
	   case '/':
		   System.out.format("%d / %d =%d \n",a,b,a/b);
		   break;
	   default:
		   System.exit(2);
		   break;
	   }
	}
	   
	 }
	
	
	
	
