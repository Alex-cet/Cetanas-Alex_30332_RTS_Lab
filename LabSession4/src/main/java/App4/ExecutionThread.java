package App4;

import java.util.concurrent.Semaphore;

public class ExecutionThread extends Thread {
    Semaphore s;
    int sleep_min, sleep_max, activity_min, activity_max, permit;
    public ExecutionThread(Semaphore s, int sleep_min, int sleep_max, int activity_min, int activity_max, int permit) {
        this.s = s;
        this.sleep_min = sleep_min;
        this.sleep_max = sleep_max;
        this.activity_min = activity_min;
        this.activity_max = activity_max;
        this.permit = permit;
    }

    public void run() {
        while (true) {
            try {
                System.out.println(this.getName() + " - STATE 1");

                this.s.acquire(this.permit);
                System.out.println(this.getName() + " - STATE 2");
                int k = (int) Math.round(Math.random() * (activity_max - activity_min) + activity_min);
                for (int i = 0; i < k * 100000; i++) {
                    i++;
                    i--;
                }
                this.s.release();

                System.out.println(this.getName() + " - STATE 3");
                try {
                    Thread.sleep(Math.round(Math.random() * (sleep_max - sleep_min) + sleep_min) * 500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + " - STATE 4");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
   }
}
