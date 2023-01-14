package oops;
class Student
{
	int rollNo;
	String name;
	static String courseName;
		
	}

public class StaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student s1=new Student();
    Student s2=new Student();
    Student s3=new Student();
    
    Student.courseName="Java Full Stack";
    s1.rollNo=1;
    s1.name="Stu1";
    
    s2.rollNo=2;
    s2.name="Stu2";
    
    s3.rollNo=3;
    s3.name="Stu3";
    
    System.out.println("s1 Roll No="+s1.rollNo+"s1 name"+s1.name+"course name"+s1.courseName);
    System.out.println("s2 Roll No="+s2.rollNo+"s2 name"+s2.name+"course name"+s2.courseName);
    System.out.println("s3 Roll No="+s3.rollNo+"s3 name"+s3.name+"course name"+s3.courseName);
    	
    
    s2.courseName="Python";
    s2.name="ABC";
    System.out.println("s1 Roll No="+s1.rollNo+"s1 name"+s1.name+"course name"+s1.courseName);
    System.out.println("s2 Roll No="+s2.rollNo+"s2 name"+s2.name+"course name"+s2.courseName);
    System.out.println("s3 Roll No="+s3.rollNo+"s3 name"+s3.name+"course name"+s3.courseName);
    	
	}

}
