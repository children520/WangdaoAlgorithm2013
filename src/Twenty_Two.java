public class Twenty_Two {
    static int gcd(int a,int b){
        return b!=0?gcd(b,a%b) :a;
    }

    public static void main(String[] args) {
        int a=12,b=5;
        System.out.print("最大公约数："+a*b/gcd(a,b));
    }
}
