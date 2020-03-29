public class Thirty_Four {
    public static void main(String[] args) {
        int n=12;
        System.out.println(Finbonaqi(n));
    }
    static int Finbonaqi(int x){
        if(x==1||x==2){
            return 1;
        }
        return Finbonaqi(x-1)+Finbonaqi(x-2);
    }
}
