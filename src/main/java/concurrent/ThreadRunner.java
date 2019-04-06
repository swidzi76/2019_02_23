package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadRunner {
    private static long MAX_NUMBER = 100000;

    public static void main(String[] args) throws InterruptedException{
        System.out.println(Thread.currentThread().getName());

        // #1
//        customThread();

//        // #2
//        runnable();

        // #3
        executorService();
    }
    private static void customThread(){
        System.out.println("Start CustomThread!");

        CustomThread thread1 = new CustomThread("Custom Thread 1");
        thread1.start();

        CustomThread thread2 = new CustomThread("Custom Thread 2");
        thread2.start();

        CustomThread thread3 = new CustomThread("Custom Thread 3");
        thread3.start();

        CustomThread thread4 = new CustomThread("Custom Thread 4");
        thread4.start();

        System.out.println("Done!");

    }
    private static void runnable(){
        System.out.println("Start CustomRunnable!");

        CustomRunnable customRunnable = new CustomRunnable();

        Thread thread1 = new Thread(customRunnable);
        thread1.start();

        Thread thread2 = new Thread(customRunnable);
        thread2.start();

        Thread thread3 = new Thread(customRunnable);
        thread3.start();

        Thread thread4 = new Thread(customRunnable);
        thread4.start();

        System.out.println("Done!");

    }
    private static void executorService() throws InterruptedException {
        System.out.println("Threads: " + Runtime.getRuntime().availableProcessors());

        long start = System.currentTimeMillis();
        System.out.println("Start ExecutorService!");

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for (int i = 1; i <= MAX_NUMBER; i++) {
            executorService.execute(new Dividers(i));
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        System.out.println("Done!");

        long end = System.currentTimeMillis();
        System.out.println(" szukamy dzielników dla liczb od 1 do " + MAX_NUMBER);
        System.out.println("Time threads: " + (end - start) + " ms");

        // dzielniki normalnie

        start = System.currentTimeMillis();
        for (int i = 1; i <= MAX_NUMBER; i++) {
            Dividers dividers = new Dividers(i);
            dividers.run();
        }
        end = System.currentTimeMillis();

        System.out.println("Time normal: " + (end - start) + " ms");

    }
}
