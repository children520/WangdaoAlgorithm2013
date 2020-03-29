import java.util.Scanner;

//时间差值
public class Third {
    int IsYeap(int x) {
        return (x % 100 != 0 && x % 4 == 0 || x % 400 == 0) ? 1 : 0;
    }

    int[][] dayOfMonth = {
            {0, 0},
            {31, 31},
            {28, 29},
            {31, 31},
            {30, 30},
            {31, 31},
            {30, 30},
            {31, 31},
            {31, 31},
            {30, 30},
            {31, 31},
            {30, 30},
            {31, 31},
    };
    class Date{
        int day;

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        int month;
        int year;
        void nextDay(){
            day++;
            if(day>dayOfMonth[month][IsYeap(year)]){
                day=1;
                month++;
                if(month>12){
                    month=1;
                    year++;
                }
            }
        }
    }
    int[][][] buf=new int[5001][13][32];
    int count=0;
    int Abs(int x){
        return x<0?-x:x;
    }
    public static void main(String[] args){
        Third.Date date=new Third().new Date();
        Third third=new Third();
        date.setDay(1);
        date.setMonth(1);
        date.setYear(0);
        while (date.getYear()!=5001){
            third.buf[date.getYear()][date.getMonth()][date.getDay()]=third.count;

            date.nextDay();
            third.count++;
        }
        System.out.println(third.count);
        int d1=0,m1=0,y1=0;
        int d2=0,m2=0,y2=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个日期：");
        for(int i=0;i<2;i++){
            if(scanner.hasNextInt()){
                int n=scanner.nextInt();
                if(i==0){
                    y1=n/10000;
                    System.out.println(y1);
                    m1=n%10000/100;
                    System.out.println(m1);
                    d1=n%10000%100;
                    System.out.println(d1);
                }else{
                    y2=n/10000;
                    m2=n%10000/100;
                    d2=n%10000%100;
                }
            }
        }
        System.out.println(third.Abs(third.buf[y2][m2][d2]-third.buf[y1][m1][d1])+1);
    }

}

