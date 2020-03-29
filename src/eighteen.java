import java.util.Scanner;

public class eighteen {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] l1=new int[10];
        int[] l2=new int[10];
        int count=0;
        int n1=0,n2=0;
        System.out.print("请输入n1：");
        if(scanner.hasNext()){
            n1=scanner.nextInt();
        }
        System.out.print("请输入n2：");
        if(scanner.hasNext()){
            n2=scanner.nextInt();
        }
        while(n1!=0){
            l1[count]=n1%10;
            n1/=10;
            count++;
        }
        while (n2!=0){
            l2[count]=n2%10;
            n2/=10;
            count++;
        }
        int sum=0;
        for(int i=0;i<l1.length;i++){
            for(int j=0;j<l2.length;j++){
                sum+=l1[i]*l2[j];
            }
        }
        System.out.print(sum);
    }
}
