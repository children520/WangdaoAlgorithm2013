package Complete;

/**
 * 输入一个整数数组
 * 输出最长子序列的数量
 */
public class LongestIncreaseSubsequence_39 {
    public static void main(String[] args) {
        int[] sequence={300,207,155,300,299,170,158,65};
        int[] count=new int[sequence.length];
        count[0]=1;

        if(sequence[1]>sequence[0]){
            count[1]=count[0]+1;
        }
        for (int i=1;i<sequence.length;i++){
            int max=1;
            for(int j=0;j<i;j++){
                if(sequence[i]<=sequence[j]){
                   max=Math.max(count[j]+1,max);
                }
            }
            count[i]=max;
        }
        for (int i=0;i<count.length;i++){
            System.out.println(count[i]);
        }
    }

}
