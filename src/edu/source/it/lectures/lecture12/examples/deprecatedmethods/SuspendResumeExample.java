package edu.source.it.lectures.lecture12.examples.deprecatedmethods;

public class SuspendResumeExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        Thread.sleep(500);
        //thread.suspend();
        Thread.sleep(5000);
        //thread.resume();
        System.out.println("Exiting application");
    }
}
