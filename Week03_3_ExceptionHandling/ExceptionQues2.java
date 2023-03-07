import java.util.*;
class ExceptionClass extends Exception{
    public String getMessage() {
        return "Number is less than 0 or greater than 100";
    }
}
public class ExceptionQues2{
	public static void main(String [] args){
        System.out.println("Enter number: ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a < 0 || a > 100){
            try{
            throw new ExceptionClass();
            }
            catch(ExceptionClass e){
                System.out.println(e.getMessage());
            }
        }
        else{
        	System.out.println("Number is between 0 to 100");
        }
    }
}
