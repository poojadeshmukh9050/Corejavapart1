package Exception;
class Learner{
	String fname;
	String iname;
}
class LearnerNameException extends Exception{
	public LearnerNameException(String s){
		super(s);
	}
}
public class LearnerUserdefinedException {
 void checkName(String fname,String iname) throws LearnerNameException {
	 
	 if(fname.isEmpty() && iname.isEmpty()) {
		 throw new LearnerNameException("Exception");
	 }
	 else {
		 System.out.println("Error");
	 }
 }
	public static void main(String[] args) {
 
		// TODO Auto-generated method stub
		Learner l= new Learner();
		l.fname="java";
		
		l.iname="c++";
	}

}
