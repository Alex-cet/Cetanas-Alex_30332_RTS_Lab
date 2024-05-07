package App4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Integer monitor1 = new Integer(1);
        Integer monitor2 = new Integer(1);

        ExecutionMainThread t1 = new ExecutionMainThread(monitor1, monitor2, 7,2,3);
        t1.start();
        new ExecutionThread(monitor1,3,5, t1).start();
        new ExecutionThread(monitor2,4,6, t1).start();
    }
}