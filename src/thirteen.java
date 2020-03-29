import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        int n=0;
        int sum=0;
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入个数：");
        if(scanner.hasNext()){
            n=scanner.nextInt();
        }
        int[] list=new int[n];
        for (int i=0;i<n;i++){
            list[i]=scanner.nextInt();
            queue.add(list[i]);
        }

        while (queue.size()>1){
            int n1=queue.peek();
            //sum+=n1;
            queue.remove();
            int n2=queue.peek();
            //sum+=n2;
            queue.remove();
            int s=n1+n2;
            queue.add(s);
            sum+=s;

        }


        System.out.print(sum);
    }
}
