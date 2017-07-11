/**
 * Created by narahara on 7/7/2017.
 */
class A extends Thread{
    public void run(){
        try{
            System.out.println("In class A");
            Thread.sleep(19902);
        }
        catch(InterruptedException e){
            System.out.println("exception");
        }
    }
}
class B extends Thread{
    public void run(){
        try{
            System.out.println("in B");
            Thread.currentThread().join();
            Thread.sleep(1768);
        }
        catch (InterruptedException e){
            System.out.println("exception");
        }
    }
}
public class Threadjoin {
    public static void main(String args[]){
        A a=new A();
        B b=new B();
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
        System.out.println("In main");
    }
}
