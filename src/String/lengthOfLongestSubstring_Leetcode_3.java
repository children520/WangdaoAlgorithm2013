package String;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class lengthOfLongestSubstring_Leetcode_3 {
    public static int lengthOfLongestSubstring(String s) {
        StringBuilder builder=new StringBuilder();
        builder.append(s.charAt(0));
        for (int i=1;i<s.length();i++){
           // if(s.charAt(i+1)!=' '){
                for(char c:builder.toString().toCharArray()){
                    //System.out.println(builder.toString());
                    if(c!=s.charAt(i)){
                        builder.append(s.charAt(i));
                    }
                }
            //}
        }
        System.out.println(builder.toString());
        return 0;
    }

    public static void main(String[] args) {
        String str="abcabcbb";
        lengthOfLongestSubstring(str);
    }
}
