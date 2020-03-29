public class Twenty_One {
    public static void main(String[] args) {
        int n1=36,n2=24;
        do{
            int temp=n1;
            n1=n2;
            n2=temp%n2;
        }while (n1!=0&&n2!=0);
        System.out.print(n1+" "+n2);
    }
}
