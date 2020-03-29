import java.util.Scanner;
import java.util.Stack;

/*
括号匹配问题
 */
public class Eleventh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        String str="";
        System.out.print("请输入：");
        StringBuilder builder=new StringBuilder();
        if (scanner.hasNext()){
            str=scanner.next();
        }
        char[] charlist=str.toCharArray();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack.push(i);
                charlist[i]=' ';
            }else if(str.charAt(i)==')'){
                if(stack.isEmpty()){
                    charlist[i]='?';
                }else{
                    stack.pop();
                    charlist[i]=' ';
                }
            }else {
                charlist[i]=' ';
            }
        }
        while (!stack.isEmpty()){
            charlist[stack.peek()]='$';
            stack.pop();
        }

        for(int i=0;i<charlist.length;i++){
            System.out.print(charlist[i]);
        }




    }
}
