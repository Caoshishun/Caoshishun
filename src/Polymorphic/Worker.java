package Polymorphic;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println(getName() + "正在工作中");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
