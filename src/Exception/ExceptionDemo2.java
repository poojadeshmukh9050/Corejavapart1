package Exception;

import java.util.Scanner;

class InvaliMarksException extends Exception{
	public InvaliMarksException(String s) {
		super(s);
	}
}
public class ExceptionDemo2 {
  static void marksChecker(int m) throws InvaliMarksException{
	  if(m<0 ||m>100) {
		  throw new InvaliMarksException("Invalid marks.");
	  }
	  else {
		  System.out.println("Valid marks.");
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter your marks:-");
     int m=sc.nextInt();
     try {
    	 marksChecker(m);
     }catch (InvaliMarksException e) {
    	 System.out.println(e);
     }
	}

}
