package oops;
class Car{
	int num=10;
	void display() {
		System.out.println("Enter No:"+num);
		
	}
	
}

class Honda extends Car{
	String name="Black";
	void display1() {
		System.out.println("Honda:"+name);
	}
}
class Vengnar extends Car{
	String name="white";
	void display2() {
		System.out.println("Vengnar:"+name);
	}
}
public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Honda h=new Honda();
     h.display();
     h.display1();
     Vengnar v=new Vengnar();
     v.display2();
	}

}
