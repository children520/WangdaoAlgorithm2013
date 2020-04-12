package Complete;

import java.util.Scanner;
//输入冒泡排序
public class BubbleSort_1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int count=0;
        System.out.println("输入要排序的数量：");
        int length=scanner.nextInt();
        int[] list=new int[length];
        while (length!=0){
            System.out.println("输入值：");
            int x=scanner.nextInt();
            if(x==0){
                break;
            }
            list[count]=x;
            length--;
            count++;
            //System.out.println(x);
        }
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
        BubbleSort(list);
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
    public static void BubbleSort(int[] list){
        for(int i=0;i<list.length;i++){
            for(int j=i+1;j<list.length;j++){
                if(list[j]<list[i]){
                    int temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
    }
}
