import java.util.Scanner;

public class Fouth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入值：");
        int n=scanner.nextInt();
        int Hash[]=new int[101];
        System.out.print("请输入成绩：");
        while(scanner.hasNext()&&n!=0){
            System.out.print("请输入成绩：");
            for(int i=1;i<=n;i++){
                int x;
                x=scanner.nextInt();
                Hash[x]++;
            }
            int x;
            System.out.println("请输入目标：");
            x=scanner.nextInt();
            System.out.println(Hash[x]);
        }
        /*
        Scanner scanner=new Scanner(System.in);
        int n=0;
        int sub=0;
        int count=0;
        String str="";
        System.out.print("请输入：");
        if(scanner.hasNextInt()){
            n=scanner.nextInt();
        }
        String x=scanner.nextLine();
        System.out.println("请输入学生成绩：");
        if(scanner.hasNext()){
            str=scanner.nextLine();
            System.out.println(str);
        }

        System.out.print("请输入给定成绩：");
        if(scanner.hasNextInt()){
            sub=scanner.nextInt();
            System.out.println(sub);
        }
        scanner.close();
        String[] list=str.split(" ");
        for(int i=0;i<list.length;i++){
            if(Integer.parseInt(list[i])==sub){
                count++;

            }
        }
        System.out.println(count);

    }

         */
    }
}




