package basicprogram;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char op;
    Double number1,number2,result;
    Scanner input = new Scanner(System.in);
    System.out.println("Choose an operator:+,-,*,or/");
    op=input.next().charAt(0);
    System.out.print("Enter first number");
    number1=input.nextDouble();
    System.out.print("Enter first number");
    number2=input.nextDouble();
    switch(op) {
    case '+':
      result =number1+number2;
      System.out.println(number1+"+"+number2+"="+result);
      break;
    case '-':
        result =number1+number2;
        System.out.println(number1+"-"+number2+"="+result);
        break;
    case '*':
        result =number1+number2;
        System.out.println(number1+"*"+number2+"="+result);
        break;
    case '/':
        result =number1+number2;
        System.out.println(number1+"/"+number2+"="+result);
        break;
    default:
    	System.out.println("Invalid operator!");
    	break;
       
    }
    input.close();    
	}

}
