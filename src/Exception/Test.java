package Exception;

class MyException extends Exception{
	private int ex;
	MyException(int a)
	{
		ex=a;
	}
		public String toString()
		{
			return "MyException["+ex+"]is less than zero";
		}
	}

public class Test {
	static void sum(int a,int b)throws MyException{
		if(a<0)
		{
			throw new MyException(a);
		}
		else {
			System.out.println(a+b);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
	sum(-10,10);
    }
    catch(MyException e)
    {
    	System.out.println(e);
}
	}

}
