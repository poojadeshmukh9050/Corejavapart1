package basicprogram;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int no=154,numb,temp,armno=0;
   numb=no;
   while(numb!=0)
   {
	   temp=numb%10;
	   armno=armno+temp*temp*temp;
	   numb/=10;
	   
   }
   if(armno==no)
	   System.out.println(no+"Is an Armstrong number");
   else
	   System.out.println(no+"Is not Armstrong number");
   
	}

}
