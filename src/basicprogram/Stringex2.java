package basicprogram;

public class Stringex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer();
        //printing default capacity of string buffer  
        System.out.println("sb1: default capacity: " + sb1.capacity()); 
        // current size 16+10 = 26
        StringBuffer sb2 = new StringBuffer("Welcome to");
        System.out.println("sb2: After declaration capacity: " + sb2.capacity());
	}

}
