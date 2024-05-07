package App3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Integer monitor = new Integer(1);
        new ExecutionThread(monitor, 5,5,3,6).start();
        new ExecutionThread(monitor, 3,3,4,7).start();
        new ExecutionThread(monitor, 6,6,5,7).start();
    }
} //Add S1 on sequence diagram