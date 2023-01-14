package StartPattern;

import java.util.Scanner;

public class Patternnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println();
     for(int i=1;i<=a;i++) {
    	 for(int j=1;j<=i;j++) {
    		 System.out.print(i+"");
    	 }
    	 System.out.println();
     }
     int b=sc.nextInt();
     System.out.println();
      for(int i=1;i<=b;i++) {
     	 for(int j=1;j<=i;j++) {
     		 System.out.print(i+"");
     	 }
     	 System.out.println();
      }
      int c=sc.nextInt();
      System.out.println();
       for(int i=1;i<=c;i++) {
      	 for(int j=1;j<=i;j++) {
      		 System.out.print(i+"");
      	 }
      	 System.out.println();
       }
	}

}
