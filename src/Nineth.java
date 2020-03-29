import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
一定金额可以拿最多的食物
 */
public class Nineth {
    class goods implements Comparable<goods>{
        double kg;
        double value;
        int s;

        @Override
        public int compareTo(goods o) {
            return o.s-this.s;
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
                Nineth.goods goods=new Nineth().new goods();
                System.out.print("请输入kg:");
                goods.kg=scanner.nextDouble();
                System.out.print("请输入value:");
                goods.value=scanner.nextDouble();
                goods.s= (int) (goods.kg/goods.value);
                list.add(goods);

            }
            Collections.sort(list);
            for(goods goods1:list){
                System.out.print(goods1.s+" ");
            }
            int index=0;
            int sum=0;
            while (money>0&&index<count){
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
