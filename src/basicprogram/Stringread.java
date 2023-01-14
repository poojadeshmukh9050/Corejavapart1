package basicprogram;

import java.io.StringReader;

public class Stringread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String data ="Tthe text read from StringReader.";
    char[] array = new char[100];
    try {
    	StringReader input = new StringReader(data);
    	input.read(array);
    	System.out.println("Data read from the string:");
    	System.out.println(array);
        input.close();
    }
    catch(Exception e) {
    	e.getStackTrace();
    }
	}

}
