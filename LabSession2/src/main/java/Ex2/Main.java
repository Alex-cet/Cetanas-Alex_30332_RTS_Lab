package Ex2;

public class Main {
    public static void main(String[] args) {
        JoinTestThread w1 = new JoinTestThread("Thread 1",null, 61312);
        JoinTestThread w2 = new JoinTestThread("Thread 2",w1, 25123);
        w1.start();
        w2.start();
    }
}
