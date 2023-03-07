import java.util.*;
public class W2Ques1 {
	private static String initials_Print(String str) {
		if (str.length() == 0)
            return "";
		String sq="";
        sq=sq+Character.toUpperCase(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++)
            if (str.charAt(i) == ' ' && str.charAt(i+1)!=' ')
                sq=sq+ Character.toUpperCase(str.charAt(i + 1));
        return sq;
	}
	public static void main(String[] args)  
	{  
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter a string: ");  
	String str= sc.nextLine();      
	System.out.print("Initials are: "+initials_Print(str));   
}}

