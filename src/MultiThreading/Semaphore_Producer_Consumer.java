package MultiThreading;

import java.util.concurrent.Semaphore;

/**
 * 信号量解决生产者，消费者问题
 */
public class Semaphore_Producer_Consumer {
    static Semaphore empty=new Semaphore(10);//仓库缓冲区
    static Semaphore full=new Semaphore(0);
    static Semaphore mutex=new Semaphore(1);
    class Producer implements Runnable{

        @Override
        public void run() {
            try{
                while (true){
                    empty.acquire();
                    mutex.acquire();
                    System.out.println("生产一个产品放入仓库");
                    mutex.release();
                    full.release();
                    Thread.sleep(100);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    class Consumer implements Runnable{

        @Override
        public void run() {
            try {
                while (true){
                    full.acquire();
                    mutex.acquire();
                    System.out.println("从仓库拿出一个产品");
                    mutex.release();
                    full.release();
                }
            }catch (Exception e){

            }
        }
    }
}
