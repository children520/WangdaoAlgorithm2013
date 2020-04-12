package Complete;

import java.util.Scanner;

public class OutputTrapezoid_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int h =0;
        System.out.println("请输入：");
        if(scanner.hasNext()){
            h=scanner.nextInt();
        }
        for(int i=h;i<2*h;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
