public class ExceptionQues3{
	public static void main(String[] args) {
		try {
			met1();
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
	}
	public static void met1() throws Exception{
		try {
			met2();
		}
		catch(Exception exception) {
			throw new Exception("Exception thrown in method1"+exception);
		}
	}
	public static void met2() throws Exception{
		try {
			met3();
		}
		catch(Exception exception) {
			throw new Exception("Exception thrown in method2"+exception);
		}
	}
	public static void met3() throws Exception{
			throw new Exception("Exception thrown in method3");
		}
}