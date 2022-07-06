package com.thread_test;

/**
 * @author qiaoshiling
 */
public class ThreadExample  implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExample());

        t1.start();
        Thread.sleep(10);
        t1.interrupt();

    }



    @Override
    public void run() {
        System.out.println("run");
        while (!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(""+Thread.currentThread().isInterrupted());
                e.printStackTrace();
            }
        }

    }
}
