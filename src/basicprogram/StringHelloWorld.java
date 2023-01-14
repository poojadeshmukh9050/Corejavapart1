package basicprogram;

public class StringHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("computer ");
		s.concat("civil");
		System.out.println(s);
		StringBuffer str = new StringBuffer("computer ");
		str.append("Engineering ");
		System.out.println(str);
		str.insert(17, "Technology ");
		System.out.println(str);
		str.replace( 8, 16, "IoT");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		
		System.out.println( str.capacity() );

	}

}
