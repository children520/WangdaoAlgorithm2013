package NoComplete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SearchStudentInfor_9 {
    static class Student implements Comparable<Student>{
        int id;

        public int getid() {
            return id;
        }

        public void setid(int id) {
            this.id = id;
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
        public Student(int id,
                String name,
                int age,
                String sex){
            this.age=age;
            this.name=name;
            this.sex=sex;
            this.id=id;
        }
        @Override
        public int compareTo(Student o) {
            return this.id-o.id;
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
            System.out.println(student.id);
        }
        System.out.println(BinarySearch(arrayList,4).name);

    }
    public static Student BinarySearch(ArrayList<Student> arrayList,int id){
        int low=0;
        int high=arrayList.size()-1;
        int mid=(low+high)/2;
        int curid=0;
        while (high>=low){
            curid=arrayList.get(mid).id;
            if(curid>id){
                high=mid-1;
                mid=(low+high)/2;
            }else if(curid<id){
                low=mid+1;
                //System.out.println(low);
                mid=(low+high)/2;
                //System.out.println(mid);
            }else if(curid==id){
                return arrayList.get(mid);
            }else {
                System.out.println("没有");
                break;
            }
        }
        return arrayList.get(low);
    }
}
