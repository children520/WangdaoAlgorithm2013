import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
贪心算法求最多能看电视节目数量
 */
public class Tenth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入");
        int n=scanner.nextInt();
        ArrayList<Integer> startList=new ArrayList<>();
        ArrayList<Integer> endList=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("请输入start:");
            startList.add(scanner.nextInt());
            System.out.println(startList.get(i));
            System.out.print("请输入end:");
            endList.add(scanner.nextInt());
            System.out.println(endList.get(i));
        }
        Collections.sort(endList);
        int currentTime=0,ans=0;
        for(int i=0;i<n;i++){
            if(currentTime<=startList.get(i)){
                currentTime=endList.get(i);
                ans++;
            }
        }
        System.out.print(ans);
    }
}
