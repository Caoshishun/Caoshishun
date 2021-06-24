package Override_;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say() {
        return "我叫" + name + " 我今年" + age + "岁";
    }
}
