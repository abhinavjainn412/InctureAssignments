public class ThreadQues3 extends Thread
{
    public ThreadQues3(String name){
        super(name);
    }
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(getName() + " is Daemon thread");
        }
        else
        {
            System.out.println(getName() + " is User thread");
        }
    } 
    public static void main(String[] args)
    {
    	ThreadQues3 t1 = new ThreadQues3("t1");
        ThreadQues3 t2 = new ThreadQues3("t2");
        ThreadQues3 t3 = new ThreadQues3("t3");
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.setDaemon(true);
        t3.start();        
    }
}