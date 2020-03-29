public class ShadowTest {
    public static boolean checkRecord(String s) {
        boolean res =false;
        int AbsentCount=0;
        int LateCount=0;

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='A'){
                AbsentCount++;
            }
            if(i+1>s.length()-1){
                break;
            }else if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i)=='L'){
                if(i+2>s.length()-1){
                    break;
                }else if(s.charAt(i+1)==s.charAt(i+2)){
                    LateCount=3;
                }

            }
        }

        System.out.println(AbsentCount+" "+LateCount);
        if(AbsentCount<=1&&LateCount<=2){
            res=true;
        }else {
            res=false;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(checkRecord("LLPPPALL"));
    }
}