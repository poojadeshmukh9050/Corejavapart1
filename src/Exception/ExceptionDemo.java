package Exception;
class Eception1{
	
}
public class ExceptionDemo {

	public static void main(String[] args) {
try {		// TODO Auto-generated method stub
int a=10,b=0;
int c=10/2;
System.out.println("Valu of c:"+c);
	}
catch(ArithmeticException e) {
	System.out.println("Exception:"+e);
}
finally {
	System.out.println("Final value");
}
}
}