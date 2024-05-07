package Ex2;

class JoinTestThread extends Thread {
    Thread t;
    String n;
    int number;
    static int sum = 0;
    JoinTestThread(String n, Thread t, int number) {
        this.n = n;
        this.setName(n);
        this.t=t;
        this.number = number;
    }
    public void run() {
        System.out.println("Thread " + n + " has entered the run() method");
        try {
            if (t != null) t.join();
            System.out.println("Thread " + n + " executing operation.");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) sum += i;
            }
            Thread.sleep(3000);
            System.out.println("Thread " + n + " has terminated operation. Sum= " + sum);
        }
        catch(Exception e){e.printStackTrace();}
    }
}