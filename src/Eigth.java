import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Eigth {
    static class Student implements Comparable<Student>{
        int no;

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        String name;
        int age;
        String sex;
        public Student(int no,
                String name,
                int age,
                String sex){
            this.age=age;
            this.name=name;
            this.sex=sex;
            this.no=no;
        }
        @Override
        public int compareTo(Student o) {
            return this.no-o.no;
        }
    }

    public static void main(String[] args) {
        Student student1=new Student(02,"张嘉",21,"男");
        Student student2=new Student(04,"李家村",21,"女");
        Student student3=new Student(05,"小米",21,"男");
        Student student4=new Student(07,"小",21,"男");
        Student student5=new Student(11,"小fja",21,"男");
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        Collections.sort(arrayList);
        for(Student student:arrayList){
            System.out.println(student.no);
        }
        System.out.println(BinarySearch(arrayList,4).name);

    }
    public static Student BinarySearch(ArrayList<Student> arrayList,int no){
        int low=0;
        int high=arrayList.size()-1;
        int mid=(low+high)/2;
        int curno=0;
        while (high>=low){
            curno=arrayList.get(mid).no;
            if(curno>no){
                high=mid-1;
                mid=(low+high)/2;
            }else if(curno<no){
                low=mid+1;
                //System.out.println(low);
                mid=(low+high)/2;
                //System.out.println(mid);
            }else if(curno==no){
                return arrayList.get(mid);
            }else {
                System.out.println("没有");
                break;
            }
        }
        return arrayList.get(low);
    }
}
