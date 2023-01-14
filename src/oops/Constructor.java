package oops;

public class Constructor {
    String name;
    String city;
    int rollno;
    String course;
    private Constructor() {
    	System.out.println("Default.");
    	name="Pooja";
    }
    Constructor(String city){
    	this.city =city;
    	System.out.println("stay at " +city);
    }
    Constructor(int r,String cr){
    	rollno= r;
    	course = cr;
    	System.out.println("Rollno and Course "+rollno+""+course );
    }
    Constructor(Constructor a)
    {
    	System.out.println("Copy Constructor.");
    	rollno =a.rollno;
    	course =a.course;
    	System.out.println("2 copy Rollno and Course "+a.rollno+""+a.course );
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Constructor c =new Constructor();
    System.out.println("My name is  "+c.name);
    Constructor c1=new Constructor("Mumbai");
    Constructor c2=new Constructor(21," JFS");
    Constructor c3=new Constructor(c2);
    System.out.println(" copy Rollno and Course "+c3.rollno+""+c3.course );
	}

}
