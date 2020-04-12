package NoComplete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
贪心算法：一定金额可以拿最多的食物
 */
public class FatMouseTrade_10 {
    class goods implements Comparable<goods>{
        double kg;
        double value;
        int costPerformance;

        @Override
        public int compareTo(goods o) {
            return o.costPerformance-this.costPerformance;
        }
    }

    public static void main(String[] args) {
        double money=100,count=0;
        ArrayList<goods> list=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入l:");
        while(scanner.hasNext()){
            if(money==-1){
                break;
            }
            int l=scanner.nextInt();
            for(int i=0;i<l;i++){
                FatMouseTrade_10.goods goods=new FatMouseTrade_10().new goods();
                System.out.print("请输入kg:");
                goods.kg=scanner.nextDouble();
                System.out.print("请输入value:");
                goods.value=scanner.nextDouble();
                goods.costPerformance= (int) (goods.kg/goods.value);
                list.add(goods);
                count++;
            }
            Collections.sort(list);

            for(goods goods1:list){
                System.out.print(goods1.costPerformance+" ");
            }
            int index=0;
            int sum=0;
            //
            while (money>0&&index<count){
                //余额大于当前物品的价值
                if(money>list.get(index).value){
                    sum+=list.get(index).kg;
                    money-=list.get(index).value;
                }else {
                    sum+=list.get(index).kg*money/list.get(index).value;
                    money=0;
                }
                index++;
            }
            System.out.print(sum);
        }
    }
}
