package Ex5;

import java.util.Date;

public class RThread extends Thread{
    FileService service;
    public RThread(FileService service) {
        this.service = service;
    }
    public void run(){
        while (!Main.isStopThreads()){
            try {
                synchronized (service) {
                    String iterator, last="no message to read";
                    while((iterator = service.in.readLine()) != null) {
                        last = new Date(System.currentTimeMillis()) + " - "
                                + iterator;
                    }
                    String readMsg = last;
                    System.out.println(readMsg);
                    Thread.sleep(3000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}