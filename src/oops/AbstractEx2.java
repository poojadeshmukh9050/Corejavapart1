package oops;

abstract class Bird{
	abstract void makesound();{
		System.out.println("Birds sound");
		
	}
}
class Duck extends Bird{
	void makesound() {
		System.out.println("Burkd like Duck");
	}
		
	}
class Owl extends Bird{

	@Override
	void makesound() {
		// TODO Auto-generated method stub
		System.out.println("Burkd like Owl");
	}
	
}

public class AbstractEx2 extends Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AbstractEx2 a= new AbstractEx2();
    a.makesound();
    Owl o=new Owl();
    o.makesound();
    Duck d =new Duck();
    d.makesound();
	}

	@Override
	void makesound() {
		// TODO Auto-generated method stub
		System.out.println("All Sounds Nice");
	}

}
