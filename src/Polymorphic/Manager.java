package Polymorphic;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void mamage() {
        System.out.println(getName() + "正在管理中");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
