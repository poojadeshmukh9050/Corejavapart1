package oops;

import java.util.Scanner;

 class Addition1{
	int a,b;
	Scanner s=new Scanner(System.in);
	void getValue() {
		System.out.println("a+b:");
		a=s.nextInt();
		b=s.nextInt();
	}
	
	void add(){
		System.out.println("Addition:"+(a+b));
		}
 }
 
	
	class Substract extends Addition1{
	 void sub1() {
		 System.out.println("sub:"+(a-b));
	 }
 }
    class Multiple extends Substract{
	 void multi1() {
		 System.out.println("multi:"+(a*b));
	 }
 }
   class Divide extends Multiple{
	 void div1() {
		 System.out.println("divide:"+(a/b));
	 }
 }
 class Modulo extends Divide{ 
	 void mod1() {
		 System.out.println("modulo:"+(a%b));
	 }
 }
public class MultilevelMultipli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Modulo s=new Modulo();
    s.getValue();
    s.add();
    s.sub1();
    s.multi1();
    s.div1();
    s.mod1();
    
    
    
	}

}
