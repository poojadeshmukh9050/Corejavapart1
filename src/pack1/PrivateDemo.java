package pack1;
class PrivateClass{
	private int a=12;
	
	 void display() {
		System.out.println("Private variable "+a);
		
	}
	
}
public class PrivateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PrivateClass p = new PrivateClass();
     
     
	p.display();
	}

}
