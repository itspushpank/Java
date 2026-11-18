
class MyThread extends Thread {

    public void run() {
        try {
            System.out.println("Thread is running...");

            Thread.sleep(2000);

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        MyThread t1 = new MyThread();


        System.out.println("Before start: " + t1.getState());


        t1.start();


        System.out.println("After start: " + t1.getState());


        Thread.sleep(500);


        System.out.println("During sleep: " + t1.getState());

        t1.join();

        System.out.println("After completion: " + t1.getState());
    }
}
