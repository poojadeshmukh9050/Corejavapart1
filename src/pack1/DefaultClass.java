package pack1;

class DefaultDemo{
	int a= 12;
	
	void display() {
		System.out.println("Defalut class variable."+a);
		
	}
}
class DefaultSub extends DefaultDemo{
	
	void displaySub() {
			System.out.println("Defalut class variable");
	}	
}
public class DefaultClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    DefaultSub d = new DefaultSub();
    d.display();
    d.displaySub();
	}

}
