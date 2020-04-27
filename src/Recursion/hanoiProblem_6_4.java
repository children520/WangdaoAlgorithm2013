package Recursion;

/**
 * 汉诺塔问题
 */
public class hanoiProblem_6_4 {
    public static void main(String[] args) {
        System.out.println(hanoi(64));
    }
    static long hanoi(int x){
        if(x==1){
            return (long) 2;
        }
        return hanoi(x-1)*3+2;

    }
}
