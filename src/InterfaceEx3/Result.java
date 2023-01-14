package InterfaceEx3;

class Result extends Student implements Exam {
    float per;
	Result(String n, int rn, int n1, int n2) {
		super(n, rn, n1, n2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Parcent_cal() {
		// TODO Auto-generated method stub
		int tot=marks1+marks2;
		per=(float)tot/2;
	}
  void Display() {
	  show();
	  System.out.println("Percentage="+per);
  }
  
	

}
