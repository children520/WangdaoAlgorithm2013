public class   Test1 {
    public static void main(String[] args) {
        int i=0;
        while (true){
            i++;
            System.out.println("1");
            if(i==2){
                continue;
            }
            if(i==5){
                System.out.println("2");
                break;
            }
        }


    }

}
