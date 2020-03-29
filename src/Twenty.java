public class Twenty {


    public static void main(String[] args) {
        int[] BaseList={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String str1="Aab3";
        int n1=15;
        int n2=7;
        int sum=0;
        int n=0;
        for (int i=str1.length()-1;i>=0;i--){
            int x=0;
            if(str1.charAt(i)>='0'&&str1.charAt(i)<='9'){
                x=str1.charAt(i)-'0';
            }else if(str1.charAt(i)>='a'&&str1.charAt(i)<='z'){
                x=str1.charAt(i)-'a'+10;
            }else if(str1.charAt(i)>='A'&&str1.charAt(i)<='Z'){
                x=str1.charAt(i)-'A'+10;
            }
            System.out.println(x);
            sum+=Math.pow(n1,n)*x;
            n++;
        }
        System.out.println(sum);
        int[] list=new int[20];
        int count=0;
        do {
            list[count]=sum%n2;
            sum/=n2;
            count++;
        }while (sum!=0);
        for(int i=list.length-1;i>=0;i--){
            System.out.print(list[i]);
        }
        //System.out.println(Math.pow(15,3)*);
    }
}
