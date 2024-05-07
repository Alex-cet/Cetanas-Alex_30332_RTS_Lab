package App4;

import java.util.Objects;

public class ExecutionThread extends Thread {
    Integer monitor;
    int activity_min, activity_max;
    ExecutionMainThread t1;
    public ExecutionThread(Integer monitor, int activity_min, int activity_max, ExecutionMainThread t1) {
        this.monitor = monitor;
        this.activity_min = activity_min;
        this.activity_max = activity_max;
        this.t1 = t1;
    }
    public void run() {
        System.out.println(this.getName() + " - STATE 1");
        synchronized (monitor) {
            try {
                monitor.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(this.getName() + " - STATE 2");
            int k = (int) Math.round(Math.random() * (activity_max
                    - activity_min) + activity_min);
            for (int i = 0; i < k * 100000; i++) {
                i++;
                i--;
            }

            System.out.println(this.getName() + " - STATE 3");
            if (t1 != null) {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
