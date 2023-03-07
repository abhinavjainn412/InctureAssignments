import java.util.Scanner;
public class W2Ques4 {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter a string: ");  
	String str= sc.nextLine();
	int zz=0;
    for (int i=0;i<str.length();i++){
      if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
    	  zz=1;
    	  break;
      }
    }
    if (zz==0) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
}
}
}