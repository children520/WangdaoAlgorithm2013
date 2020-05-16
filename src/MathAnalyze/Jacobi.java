package MathAnalyze;

/**
 * 雅可比迭代法
 */
public class Jacobi {
    static class X{
        float x1;
        float x2;
        float x3;
    }
    static X jcobi(X x){
        X temp=new X();
        temp.x1=(3*x.x2-2*x.x3+20)/8;
        temp.x2=(-4*x.x1+x.x3+33)/(-11);
        temp.x3=(-6*x.x1-3*x.x2+36)/12;
        return temp;
    }
    public static void main(String[] args){
        X v=new X();
        v.x1=0;
        v.x2=0;
        v.x3=0;
        int i=20;
        while (i--!=0){
            v=jcobi(v);

        }
        System.out.println(v.x1+" "+v.x2+" "+v.x3);
    }
}
