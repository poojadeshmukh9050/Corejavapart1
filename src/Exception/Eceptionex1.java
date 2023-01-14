package Exception;

public class Eceptionex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 int arry[]= {1,2,3};
    	 System.out.println("Array:"+arry[3]);
     }
     catch(Exception e)
     {
    	 System.out.println("Exception error array");
     }
     finally {
    	 System.out.println("finally code");
     }
	}

}
