package Generic_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GenericExercise {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("jack",18));
        set.add(new Student("tom",16));
        set.add(new Student("mary",19));

        for (Student student : set) {
            System.out.println(student);
        }

        //泛型就是给集合，确定同一类型。
        HashMap<String, Student> hashMap = new HashMap<>();

    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}