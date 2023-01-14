package oops;

public class ImplicitExplicit{
	
	public static void main(String[] args) {
		//implicit /widening
		byte b=20;
		int i=b;
		System.out.println(i);
		
		//Explicit/narrowing
		int i1=60;
		byte b1=(byte)i1;
		System.out.println(b1);

	}
}