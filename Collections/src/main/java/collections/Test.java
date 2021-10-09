package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(10);
        Student  s2 = new Student(20);
        Student  s3 = new Student(1);
        Student  s4 = new Student(-1);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        Collections.sort(students,new CompareStufdentByid());

        for(Student student : students){
            System.out.println(student.getId());
        }


    }
}
