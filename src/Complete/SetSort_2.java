package Complete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//学生成绩集合排序
public class SetSort_2 {
   static class Student implements Comparable<Student>{
        public Student(String name,int grade,int age){
            this.name=name;
            this.grade=grade;
            this.age=age;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        String name;
        int grade;
        int age;

        @Override
        public int compareTo(Student s) {
            int res1=s.getGrade()-this.getGrade();
            return res1;
        }
    }
    public static void main(String[] args){
        Student student1=new Student("s",98,21);
        Student student2=new Student("a",97,20);
        Student student3=new Student("a",98,22);
        ArrayList<Student> studentArrayList=new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        //实现从按照成绩，姓名，年龄高低排序
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int s1=(o1.getGrade()-o2.getGrade());
                int s2=(int)(o1.getName().charAt(0)-o2.getName().charAt(0));
                int s3=o1.age-o2.age;
                if (s1==0){
                    return s2;
                }
                if(s2==0){
                    return s3;
                }
                return s1;
            }
        });
        for (Student student:studentArrayList){
            System.out.println(student.getGrade()+" "+student.getName()+" "+student.getAge());
        }
    }

}
