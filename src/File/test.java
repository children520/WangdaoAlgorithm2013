package File;

import java.io.File;

public class test {
    public static void main(String[] args) {
        String dirname="C:/Users/13064/Desktop/书籍";
        File file=new File(dirname);
        if(file.isDirectory()){
            System.out.println(file.getAbsolutePath());
            String[] s=file.list();
            for (int i=0;i<s.length;i++){
                File file1=new File(dirname+"/"+s[i]);
                if(file1.isDirectory()){
                    System.out.println(s[i]+"目录");
                }else {
                    System.out.println(s[i]+"  文件");
                }
            }
        }
    }
}
