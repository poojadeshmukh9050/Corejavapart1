package oops;



class Bike{  
	int speed=100;
	   void run()
	  {
		  System.out.println("running...");
		  }  
	}  
	
class Honda1 extends Bike{  
	   
	void run() {
		  System.out.println("running speed:"+speed);
	  }
}
public class FinalKeyword {

   public static void main(String[] args) {
		// TODO Auto-generated method stub
   Honda1 honda = new Honda1();
   honda.run();
  // Bike b=new Bike();
   honda.speed=200;
   honda.run();
	}

}
