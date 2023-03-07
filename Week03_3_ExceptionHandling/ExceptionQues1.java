import java.util.*;
public class ExceptionQues1 {
	 public static void check(int no,int no1) throws ArithmeticException {
	        if (no1==0) {
	            throw new ArithmeticException("Number cannot be zero");
	        }
	        else{
	            System.out.println(no/no1);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try{
	            int no = sc.nextInt();
	            int no1 = sc.nextInt();
	            check(no,no1);
	        }
	        catch(ArithmeticException e){
	            System.out.println("Exception : "+e.getMessage());
	        }
	    }
}
