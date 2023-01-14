package oops;

public class ThisEx2 {
    int a,b;
    
	public ThisEx2(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
    ThisEx2(int a){
    	this(a,a);
    }
    ThisEx2()
    {
    	this(0);
    	
    }
    
	@Override
	public String toString() {
		return "ThisEx2 [a=" + a + ", b=" + b + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ThisEx2 t1=new ThisEx2();
    ThisEx2 t2=new ThisEx2(23);
    ThisEx2 t3=new ThisEx2(2,3);
    System.out.println("t1: "+t1);
    System.out.println("t1: "+t2);
    System.out.println("t1: "+t3);
	}

}
