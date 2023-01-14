package basicprogram;

import java.util.Arrays;

public class Stringconcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1 =new String("Hello");
       String s2 ="pooja";
       String s ="HELLO  ";
       String s3 ="My Name is";
       System.out.println(s1+"" +s2);
       System.out.println(s3.concat(s2));
       System.out.println("Length:"+s3.length());
       System.out.println("substring:"+s3.substring(4,7));
       System.out.println("Upper Case:"+s2.toUpperCase());
       String s4 ="";
       System.out.println("To check a null:"+s4.isBlank());
       char[] arr =new char[10];
       s3.getChars(0, 10, arr, 0);
       System.out.println("Getchars:"+Arrays.toString(arr));
       System.out.println("Comparison:"+s.compareTo(s1));
       System.out.println("Equals:"+s1.equals(s));
       System.out.println("StartWith :"+s1.startsWith("He"));
       System.out.println("EndWith :"+s1.endsWith("p"));
       System.out.println("Replace:"+s2.replace("pooja","Anam"));
       System.out.println("Repeat:"+s.repeat(6));
       System.out.println("CharAt:"+s3.charAt(0));
       System.out.println("Trim Lead:"+s.stripLeading());
       System.out.println("Trim Trail:"+s.stripTrailing());
       
	}

}
