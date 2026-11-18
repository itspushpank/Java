
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread is running...");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 : " + i);
        }
    }
}

class MyThreadsecond implements Runnable {

    public void run() {
        System.out.println("Thread is running...");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2 : " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThreadsecond obj = new MyThreadsecond();
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();
    }
}
