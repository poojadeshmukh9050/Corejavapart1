package oops;

class Parent{
	int sid=10;
	void display() {
	
	System.out.println("Roll No="+sid);
	}//end parent class
}
	//child class
	class ChildStud extends Parent{
		String name="Computer Eng";
		void displayChild() {
			System.out.println(name);
		}
	}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChildStud e=new ChildStud();
    e.display();
    e.displayChild();
	}

}
