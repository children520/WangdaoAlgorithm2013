package Complete;

/**
 * 输入两个字符串
 * 最长公共子序列
 */
public class LongestCommonSequence_39 {
    public static void main(String[] args) {
        String first="abcdzz";
        String second="abcdzz";
        int[][] longestCount=new int[20][20];
        for(int i=0;i<first.length();i++){
            longestCount[i][0]=0;
        }
        for(int i=0;i<second.length();i++){
            longestCount[0][i]=0;
        }
        longestCount[first.length()-1][0]=0;
        longestCount[0][second.length()-1]=0;
        for(int i=1;i<=first.length();i++){
            for (int j=1;j<=second.length();j++){
                if(first.charAt(i-1)==second.charAt(j-1)){
                    longestCount[i][j]=longestCount[i-1][j-1]+1;
                }else {
                    longestCount[i][j]=Math.max(longestCount[i-1][j],longestCount[i][j-1]);
                }
                System.out.println(longestCount[i][j]);
            }
        }

    }
}
