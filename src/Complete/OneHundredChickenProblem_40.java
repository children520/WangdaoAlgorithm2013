package Complete;

public class OneHundredChickenProblem_40 {
    public static void main(String[] args) {
        int money=40*3;
        int bigChicken=5*3;
        int smallChicken=3*3;
        int smallVeryChicken=1;
        for (int i=0;i<money/bigChicken;i++){
            for(int j=0;j<money/smallChicken;j++){
                for (int k=0;k<=money/smallVeryChicken;k++){
                    if(i+j+k==100&&(i*bigChicken+j*smallChicken+k*smallVeryChicken<=money)){
                        System.out.print(i+" "+j+" "+k);
                    }
                }
            }
        }
    }
}
