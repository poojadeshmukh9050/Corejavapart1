package oops;

abstract class Bike1{
	abstract void speed();
      void display() {
			System.out.println("Bike class");
		}
	}
class Motorbike extends Bike1{

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Motor Bike");
	}
	 
}


public class AbstractEx1 extends Bike1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Bike1 b= new Bike1();
		Bike1 a= new AbstractEx1();
		a.display();
		a.speed();
		Motorbike m=new Motorbike();
		m.speed();
	}
	

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Nice Bike");
	}

}
