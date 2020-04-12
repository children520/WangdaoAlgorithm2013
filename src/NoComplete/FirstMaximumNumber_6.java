package NoComplete;

import java.util.Scanner;
//hash算法输出前m个数
public class FirstMaximumNumber_6 {
    public static void main(String[] args) {
        int hash[]=new int[1000001];
        int offset=500000;
        Scanner scanner=new Scanner(System.in);
        int n,m;
        System.out.println("n:");
        n=scanner.nextInt();
        System.out.println("m:");
        m=scanner.nextInt();
        for(int i=-500000;i<=n;i++){
            int x=scanner.nextInt();
            hash[x]=1;
        }
        for(int i=10000000;i>=0;i--){
            if(hash[i]==1){
                System.out.println(i);
                m--;
                if(m!=0){
                    System.out.println(" ");
                }else{
                    break;
                }
            }
        }
    }
}
