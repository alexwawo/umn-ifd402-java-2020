package week10.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread starting ");
        // create and start executing three threads
        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");
        do {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        } while(mt1.count != 10 || mt2.count != 10 || mt3.count != 10);
        System.out.println("Main thread ending");
    }
}
