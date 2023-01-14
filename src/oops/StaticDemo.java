package oops;

public class StaticDemo {
  static int a,b;
  static String n;
  static void display() {
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(n);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StaticDemo.a=10;
     StaticDemo.b=20;
     StaticDemo.n="abc";
     StaticDemo.display();
     
     
	}

}
