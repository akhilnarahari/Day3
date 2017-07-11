/**
 * Created by narahara on 7/7/2017.
 */
class threadexamp implements Runnable{
    public void run(){
        try{
            System.out.println("In main class");
            Thread.sleep(10000);
        }
        catch(InterruptedException e)
        {
            System.out.println("exception occurred");
        }
    }
}
public class threadrunnable {
    public static void main(String args[]){
        threadexamp thr=new threadexamp();
        Thread t=new Thread(thr);
        t.start();
    }
}
