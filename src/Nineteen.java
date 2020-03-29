import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int n1=0,n2=0;
        if(scanner.hasNext()){
            n1=scanner.nextInt();
        }
        if(scanner.hasNext()){
            n2=scanner.nextInt();
        }
        long n=n1+n2;
        System.out.print("输入进制：");
        int m=0;
        if(scanner.hasNext()){
            m=scanner.nextInt();
        }
        //System.out.print(n);
        int[] list=new int[20];
        int count=0;
        //System.out.print(n1/8);
        do{
            list[count]=(int)n%m;
            n/=m;
            count++;
        }while (n!=0);
        for(int i=list.length-1;i>=0;i--){
            System.out.print(list[i]);
        }
    }
}
