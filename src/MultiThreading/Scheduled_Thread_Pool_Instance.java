package MultiThreading;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Scheduled_Thread_Pool_Instance {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor =new ScheduledThreadPoolExecutor(1);
        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("--------");
            }
        },1000,5000, TimeUnit.MILLISECONDS);
        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(System.nanoTime());
            }
        },1000,2000,TimeUnit.MILLISECONDS);
    }

}
