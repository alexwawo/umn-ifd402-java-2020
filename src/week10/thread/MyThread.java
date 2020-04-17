package week10.thread;

public class MyThread implements Runnable {
    int count;
    Thread thread;

    MyThread(String name) {
        thread = new Thread(this, name);
        count = 0;
        thread.start();
    }

    public void run() {
        System.out.println(thread.getName() + " starting");
        try {
            do {
                Thread.sleep(500);
                System.out.println("In " + thread.getName() + ", count is " + count);
                count++;
            } while(count < 10);
        } catch(InterruptedException e) {
            System.out.println(thread.getName() + " interrupted");
        }
        System.out.println(thread.getName() + " Terminating");
    }

}
