package App1;

import java.util.Objects;

public class ExecutionThread extends Thread {
    Integer monitor1, monitor2;
    int sleep_min, sleep_max, activity_min, activity_max;
    public ExecutionThread(Integer monitor1, Integer monitor2, int sleep_min, int
            sleep_max, int activity_min, int activity_max) {
        this.monitor1 = monitor1;
        this.monitor2 = monitor2;
        this.sleep_min = sleep_min;
        this.sleep_max = sleep_max;
        this.activity_min = activity_min;
        this.activity_max = activity_max;
    }
    public void run() {
        System.out.println(this.getName() + " - STATE 1");

        if (monitor1 != null && monitor2 == null) {
            synchronized (monitor1) {
                execute();
            }
        } else if (monitor2 != null && monitor1 == null) {
            synchronized (monitor2) {
                execute();
            }
        } else {
            synchronized (monitor1) {
                synchronized (monitor2) {
                    execute();
                }
            }
        }

        System.out.println(this.getName() + " - STATE 3");
    }

    private void execute() {
        System.out.println(this.getName() + " - STATE 2");
        int k = (int) Math.round(Math.random() * (activity_max
                - activity_min) + activity_min);
        for (int i = 0; i < k * 100000; i++) {
            i++;
            i--;
        }
        try {
            Thread.sleep(Math.round(Math.random() * (sleep_max
                    - sleep_min) + sleep_min) * 500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
