package basicprogram;

public class modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int sum=2 ,num=3 ;
    
       while(num>0) {
    	int rem =num%10;
    	sum =sum+rem;
    	num=num/10;
    	
         }
    System.out.println("Sum of digit:"+sum);
	}

}
