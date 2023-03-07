public class ThreadQues4 extends Thread  
{    
    public void run()  
    {    
        System.out.println("running...");    
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("After 1000 milliseconds ...");
        
    }    
    public static void main(String args[])  
    {    
    	ThreadQues4  t1=new ThreadQues4();    
        System.out.println("Name of t1: "+t1.currentThread().getName());  
        System.out.println("Id of t1: "+t1.currentThread().getId());
        System.out.println("is t1 active "+t1.isAlive());
        t1.start();  
        System.out.println("is t1 active "+t1.isAlive());
    }    
} 