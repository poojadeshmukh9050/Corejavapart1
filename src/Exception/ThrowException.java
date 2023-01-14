package Exception;


public class ThrowException {

	static void Age(int age) {
		
	if(age<18) {
		throw new ArithmeticException("age defined");
	}
	else
	{
		System.out.println("age not defined");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Age(40);
//   try {
//	   String s=null;
//	   System.out.println("Length:"+s.length());
////	   int a= Integer.parseInt(null);
////	   System.out.println("a"+a);
////	   int b= Integer.parseInt("Hii");
////	   System.out.println("b"+b);
////	   int c= Integer.parseInt("90");
////	   System.out.println("c"+c);
//	    }
//   catch(Exception e) {
//	  System.out.println("Error"+e);
//	   
		
		
//   }
	}

}
