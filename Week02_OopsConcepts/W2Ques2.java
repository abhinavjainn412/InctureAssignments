import java.util.Scanner;
public class W2Ques2 {
	public static void main(String args[]){  
			Scanner sc= new Scanner(System.in);  
			System.out.print("Enter s1: ");  
			String s1= sc.nextLine();
			System.out.print("Enter s2: ");
			String s2= sc.nextLine();
			String s3=s1.concat(s2);
			System.out.print("Concatenation Method1: ");
		    System.out.println(s3); 
		    String s = s1+s2;
		    System.out.print("Concatenation Method2: ");
            System.out.println(s.toString());
		  }  
}
