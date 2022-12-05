package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public Student(String name){
        this.name=name;
    }

    public static void main(String[]args){

        Student student=new Student("Ilim");
        Student student1=new Student("Nurislam");
        Student student2=new Student("Ilim");

        ArrayList<Student>students=new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        ArrayList<Student>students1=new ArrayList<>();
        System.out.println(students1);




    }
}
