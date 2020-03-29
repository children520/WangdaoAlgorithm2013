import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        /*
        Scanner scanner=new Scanner(System.in);
        String  str="";
        System.out.print("请输入：");
        if(scanner.hasNextLine()){
            str=scanner.nextLine();
        }
        int n=Integer.parseInt(str.split(" ")[0]);
        String n1=str.split(" ")[1];
        String n2=str.split(" ")[2];
        String[][] res=new String[n/2+1][n];
        for(int i=0;i<n;i++){
            if(i==0||i==n-1){
                res[0][i]=" ";
            }
            res[0][i]=n2;
        }
        String[] list=new String[n];
        for(int i=1;i<n/2+1;i++){
            if(i%2==0){
                for (int j=i;j<list.length-i;j++){
                    list[j]=n2;
                }
            }else{
                for (int j=i;j<list.length-i;j++){
                    list[j]=n1;
                }
            }
            for(int k=0;k<list.length;k++){
                System.out.print(list[k]);
                res[i][k]=list[k];
            }
            System.out.println();
        }
        for(int i=n/2+1;i>=0;i--){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }

    }

         */
        Scanner scanner=new Scanner(System.in);
        String  str="";
        System.out.print("请输入：");
        if(scanner.hasNextLine()){
            str=scanner.nextLine();
        }
        int n=Integer.parseInt(str.split(" ")[0]);
        String n1=str.split(" ")[1];
        String n2=str.split(" ")[2];
        String[][] outPutBuf=new String[82][82];
        boolean firstCase=true;
        for (int i=1,j=1;i<=n;i+=2,j++){
            int x=n/2+1,y=x;
            x-=j-1;
            y-=j-1;
            String c= j%2 ==1 ? n1 :n2;
            for(int k=0;k<=i;k++){
                outPutBuf[x+k-1][y]=c;
                outPutBuf[x][y+k-1]=c;
                outPutBuf[x+i-1][y+k-1]=c;
                outPutBuf[x+k-1][y+i-1]=c;
            }

        }
        if(n!=1){
            outPutBuf[1][1]=" ";
            outPutBuf[n][1]=" ";
            outPutBuf[1][n]=" ";
            outPutBuf[n][n]=" ";
        }
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(outPutBuf[i][j]);
            }
            System.out.println();
        }

    }
}
