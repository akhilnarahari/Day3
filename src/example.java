/**
 * Created by narahara on 7/7/2017.
 */
class trex implements Runnable{
    trex(){

    }
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        } catch(Exception e) {

        }
        System.out.println("child");
    }
}
public class example {
    public static void main(String args[]){
        trex t=new trex();
        Thread tr=new Thread(t);
        tr.start();
        System.out.println("end of main");
    }
}
