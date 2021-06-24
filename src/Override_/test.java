package Override_;

public class test {
    public static void main(String[] args) {
        Student student = new Student("曹世顺", 19, "5720192001", 75);
        System.out.println(student.say());
        Person person = new Person("曾yi", 19);
        System.out.println(person.say());
    }
}
