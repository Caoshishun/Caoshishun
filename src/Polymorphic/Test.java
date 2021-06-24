package Polymorphic;

public class Test {
    public static void main(String[] args) {
        Employee gg = new Worker("Mark",5000);
        Employee mm = new Manager("Mary",8000,50000);
        Test test = new Test();
        test.testWork(gg);
        test.testWork(mm);
        System.out.println("word".equals("word"));"hello".equals("word");
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();
            System.out.println(e.getName() + "的年薪是 " + e.getAnnual());
        } else if (e instanceof Manager){
            ((Manager) e).mamage();
            System.out.println(e.getName() + "的年薪是 " + e.getAnnual());
        } else {
            System.out.println("您输出的类型有误请重试");
        }
    }
}
