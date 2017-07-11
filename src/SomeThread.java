/**
 * Created by narahara on 7/7/2017.
 */
class MySmpThread extends Thread{//step 1
    //Thread class is in java.lang package
    String s1="Hello how are you";
    public MySmpThread(){

    }
    public MySmpThread(String str)
    {
        this.s1=str;
        System.out.println("This is MySmpThread() Constructor");
    }
    //step 2
    public void run(){//public void run() need to be overridden
        for(int i=0;i< toString().length();i++)
            try{

                System.out.println("other thread:"+s1.charAt(i));
                Thread.sleep(100); //in milliseconds
            } catch (InterruptedException iex) {//checked exception
                System.out.println("Exception in thread: "+iex.getMessage());
                break;
            }
        }
    }
public class SomeThread {
    public static void main(String a[]){
        String s2="I am fine";
        //main thread starts by default
        System.out.println("Starting Main Thread...");

        //step 3
        MySmpThread mst = new MySmpThread();

        //from this main thread, start MySmpThread thread, by invoking start()

        //step 4
        mst.start();
        for(int i=0;i<s2.length();i++){
            try{
                System.out.println("Main Thread:"+s2.charAt(i));
                Thread.sleep(100);//delays program execution by 100ms
            } catch (Exception iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
                break;
            }
        }
        System.out.println("End of Main Thread...");
    }
}