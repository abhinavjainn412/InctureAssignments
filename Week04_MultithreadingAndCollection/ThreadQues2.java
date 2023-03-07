import java.util.Scanner;
class Even extends Thread{
	int a,b;
	Even(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void run() {
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.println("Even is : "+i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Odd extends Thread{
	int a,b;
	Odd(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void run() {
		for(int i=a;i<=b;i++) {
			if(i%2!=0) {
				System.out.println("Odd is : "+i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadQues2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start number: ");
		int a=sc.nextInt();
		System.out.println("Enter End number: ");
		int b=sc.nextInt();
		Even e1=new Even(a,b);
		Odd o1=new Odd(a,b);
		e1.start();
		o1.start();
	}
}
