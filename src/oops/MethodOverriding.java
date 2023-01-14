package oops;

class Emp {
	String ename="Pooja";
	int eno;
	Emp(int eno){
		this.eno=eno;
	}
	void disp() {
		System.out.println("Employee class"+eno);
	}
}
class Dept extends Emp{
	String ename="ABC";
	Dept(){
		super(20);
	}
	void disp()
	{
		super.disp();
		System.out.println("Department class "+super.ename);
	}
}
public class MethodOverriding {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dept d=new Dept();
    d.disp();
  //  Emp e=new Emp();
  //  e.disp();
	}

}
