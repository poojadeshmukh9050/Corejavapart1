package basicprogram;

public class Switchmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ob=50;
		
		System.out.println("Enter the grade between 1 and 100:");
        int g =ob;
        double gd =g/10;
        if(gd>=9 && gd<=10)
        	System.out.println("Distinction");
        else if(gd>8 && gd<=9)
        	System.out.println("A grade");
        else if(gd>7 && gd<=8)
        	System.out.println("B grade");
        else if(gd>6 && gd<=7)
        	System.out.println("c grade");
        else if(gd>5 && gd<=6)
        	System.out.println("D grade");
        else if(gd<=5)
        	System.out.println("Fail");
        else
    		System.out.println("Invalid choice");
	}
}
        
     
