/**
 * Created by narahara on 7/7/2017.
 */
class ABC{
     void printword(String message) {
         for (int i = 0; i < message.length(); i++) {
             System.out.print(message.charAt(i));
         }
         System.out.println();
    }
}
class ABCD implements Runnable{
    String message;
    ABC abc;
    ABCD(String message,ABC abc) {
        this.message = message;
        this.abc = abc;
    }
    public ABCD() {

    }
    public void run() {
        String[] messages = this.message.split("");
        for (String msg : messages) {
            abc.printword(msg);
        }
    }
}
public class Synchronizedword {
    public static void main(String args[]){
        ABC abc=new ABC();
        Thread t1=new Thread(new ABCD("hello how are you",abc));
        Thread t2=new Thread(new ABCD("I am fine",abc));
        t1.start();
        t2.start();
    }
}
