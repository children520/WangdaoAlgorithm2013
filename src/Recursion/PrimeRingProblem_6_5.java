package Recursion;

/**
 * 素数环问题
 * 给定1-n的数字，使得环中任意两个数字间的和为素数
 */
public class PrimeRingProblem_6_5 {
    static int max=6;
    static int[] printList=new int[max+1];
    static boolean[] markedList=new boolean[max+1];
    static int count=0;
    public static void main(String[] args) {
        for (int i=0;i<max;i++){
            markedList[i]=false;
        }
        markedList[1]=true;
        printList[1]=1;
        Generate(1);

    }
    static void Generate(int val){

        for (int i=2;i<=max;i++){
            if(markedList[i]==false&&isPrime(printList[val]+printList[val-1])){
                markedList[i]=true;
                printList[val+1]=i;
                if(val<max){
                    Generate(val+1);
                }

                markedList[i]=false;
            }

        }
        if(val==max){
            print();
            return;
        }

    }
    static boolean isPrime(int val){
        for(int j=2;j<=Math.sqrt(val);j++){
            if(val%j==0){
                return false;
            }
        }
        return true;
    }
    static void print(){
        if(!isPrime(printList[max-1]+printList[0])){
            return;
        }
        for (int i=0;i<printList.length;i++){
            System.out.print(printList[i]+" ");
        }
        System.out.println();
    }
}
