package edu.source.it.lectures.lecture12.examples.deprecatedmethods;

public class DestroyExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        Thread.sleep(1000);
        thread.destroy();
        System.out.println("Exiting application");
    }
}

