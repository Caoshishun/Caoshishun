package Homework;

public class Homework01 {
    public static void main(String[] args) {
        Person[] person01 = new Person[3];
        person01[0] = new Person("jack",28,"teacher");
        person01[1] = new Person("Tim",19,"teacher");
        person01[2] = new Person("Mary",40,"teacher");
        new Person().Bubbling(person01);
        for (int i = 0; i < person01.length; i++) {
            System.out.println(person01[i]);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    //冒泡排序

    public void Bubbling(Person[] person) {
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0;j < person.length - 1 -i;j++){
                Person temp = null;
                if(person[i].getAge() > person[i+1].getAge()) {
                    temp = person[i];
                    person[i] = person[i+1];
                    person[i+1] = temp;
                }

            }
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}




