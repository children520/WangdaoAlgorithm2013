package MultiThreading;

/**
 * 生产者消费者模型
 */
public class Producer_Consumer {
    public static void main(String[] args) {
        synContainer container=new synContainer();
        Producer producer =new Producer(container);
        Consumer consumer=new Consumer(container);
        producer.start();
        consumer.start();
    }

}
class Producer extends Thread{
    synContainer container;
    public Producer(synContainer container){
        this.container=container;
    }
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("生产第"+i+"数据");
            container.push(new streamData(i));
        }
        super.run();

    }
}
class Consumer extends Thread{
    synContainer container;

    public Consumer(synContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("消费第"+container.pop().id+"数据");
        }
        super.run();

    }
}
class synContainer{
    streamData[] datas=new streamData[10];
    int count=0;
    public synchronized void push(streamData data){
        if(count==datas.length-1){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(count);
        datas[count]=data;
        this.notifyAll();
    }
    public synchronized streamData pop(){
        if(count==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        System.out.println(count);
        streamData data=datas[count];
        this.notifyAll();
        return data;
    }
}
class streamData{
    int id;

    public streamData(int id) {
        this.id = id;
    }
}
