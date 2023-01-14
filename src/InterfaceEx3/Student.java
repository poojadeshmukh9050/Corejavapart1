package InterfaceEx3;

public class Student {

	int roll_no,marks1,marks2;
	   String name="pooja";
	   Student(String n,int rn,int n1,int n2){
		   name=n;
		   roll_no=rn;
		   marks1=n1;
		   marks2=n2;
		   
	   }
	   void show() 
	
	   {
		   System.out.println("Student name:"+name);
		   System.out.println("Student rollno:"+roll_no);
		   System.out.println("Student marks1:"+marks1);
		   System.out.println("Student marks2:"+marks2);
	   }
}