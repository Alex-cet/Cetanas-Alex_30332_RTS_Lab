package App4;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Semaphore s = new Semaphore(2);
        new ExecutionThread(s, 5,5,3,6, 1).start();
        new ExecutionThread(s, 3,3,4,7, 1).start();
        new ExecutionThread(s, 6,6,5,7, 1).start();
    }
}