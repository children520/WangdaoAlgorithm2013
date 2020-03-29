import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class twelve {
    static Stack<Character> OperatorStack=new Stack<>();
    static Stack<Double> NumberStack=new Stack<>();
    static String str="";
    public static void main(String[] args) {
        /*
        Stack<Character> OperatorStack=new Stack<>();
        Stack<Double> NumberStack=new Stack<>();
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('+',1);
        map.put('-',2);
        map.put('*',3);
        map.put('/',4);
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入表达式：");
        String str=scanner.next();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                System.out.println("1");
                if(!OperatorStack.isEmpty()){
                    if(map.get(str.charAt(i))>map.get(OperatorStack.peek())){
                        OperatorStack.push(str.charAt(i));
                    }else{

                        char c=OperatorStack.pop();
                        double x1=0,x2=0,sum=0;
                        while (!NumberStack.isEmpty()){
                            x1=NumberStack.pop();
                            System.out.println(x1);
                            x2=NumberStack.pop();
                            System.out.println(x2);
                        }
                        switch (c){
                            case '+':
                                sum=x1+x2;
                                break;
                            case '-':
                                sum=x1-x2;
                                break;
                            case '*':
                                sum=x1*x2;
                                break;
                            case '/':
                                sum=x1/x2;
                                break;
                        }
                        NumberStack.push(sum);
                    }
                }else {
                    OperatorStack.push(str.charAt(i));
                }

            }else{
                NumberStack.push(Double.parseDouble(String.valueOf(str.charAt(i))));
            }
        }
        System.out.print(NumberStack.peek());
    }
         */

        Scanner scanner=new Scanner(System.in);
        int[][] match={
                {1,0,0,0,0},
                {1,0,0,0,0},
                {1,0,0,0,0},
                {1,1,1,0,0},
                {1,1,1,0,0}
        };
        if(scanner.hasNext()){
            str=scanner.next();
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'&&str.charAt(i)==0){
                break;
            }
            boolean returnOp=false;
            int returnNum=0;
            int index=0;
            while (!OperatorStack.empty()){
                OperatorStack.pop();
            }
            while (!NumberStack.empty()){
                NumberStack.pop();
            }
            while (true){
                GetOp(returnOp,returnNum,index);
                if(returnOp==false){
                    NumberStack.push((double)returnNum);
                }else{
                    double sum;
                    if(OperatorStack.isEmpty()==true||match[returnNum][OperatorStack.peek()]==1){
                        //OperatorStack.push(returnNum);
                    }else {
                        while (match[returnNum][OperatorStack.peek()]==0){
                            int ret=OperatorStack.peek();
                            OperatorStack.pop();
                            double b=NumberStack.peek();
                            NumberStack.pop();
                            double a=NumberStack.peek();
                            NumberStack.pop();
                            if(ret==1){
                                sum=a+b;
                            }else if(ret==2){
                                sum=a-b;
                            }else if(ret==3){
                                sum=a*b;
                            }else{
                                sum=a/b;
                            }
                            NumberStack.push(sum);
                        }
                        //OperatorStack.push(returnNum);
                    }
                }
                if(OperatorStack.size()==2&&OperatorStack.peek()==0){
                    break;
                }
            }

        }
    }
    static void GetOp(boolean retOp,int retNum,int i){
        if(i==0&&OperatorStack.isEmpty()==true){
            retOp=true;
            retNum=0;
            return;
        }
        if(str.charAt(0)=='0'){
            retOp=true;
            retNum=0;
            return;
        }
        if (str.charAt(i)>='0'&&str.charAt(i)<=9){
            retOp=false;
        }else{
            retOp=true;
            if(str.charAt(i)=='+'){
                retNum=1;
            }else if(str.charAt(i)=='-'){
                retNum=2;
            }else if(str.charAt(i)=='*'){
                retNum=3;
            }else if(str.charAt(i)=='/'){
                retNum=4;
            }
            i+=2;
            return;
        }
        retNum=0;
        for(;str.charAt(i)!=' '&&str.charAt(i)!='0';i++){
            retNum*=10;
            retNum+=str.charAt(i)-'0';
        }
        if(str.charAt(i)==' '){
            i++;
        }
        return;
    }

}
