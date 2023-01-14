package Encapsulation;

public class StudentEncapsulation {
public static void main(String[] args) {
//	Student s = new Student();
//	s.setRno(12);
//	s.setName("Pooja");
//	s.setCity("Raigad");
//	System.out.println("Student roll no:"+s.getRno());
//	System.out.println("Student nume:"+s.getName());
//	System.out.println("City:"+s.getCity());
//	
	Student s = new Student(34,"Pooja","Pune");
	System.out.println("Student roll no:"+s.getRno());
	System.out.println("Student nume:"+s.getName());
	System.out.println("City:"+s.getCity());
	
	s.setRno(23);
	System.out.println("Student roll no:"+s.getRno());
}
}
