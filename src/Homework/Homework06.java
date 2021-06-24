package Homework;

public class Homework06 {
    public static void main(String[] args) {
        Person01 p = new Person01("唐僧", new Horse());
        p.common();
        p.passRiver();
        p.common();
        p.passRiver();
    }
}

interface Vehicles {
    public void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("一般情况下，使用马儿前进");
    }
}

class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("过河使用船前进");
    }
}

class VehiclesFactory{
    public static Horse getHorse() {
        return new Horse();
    }
    public static Boat getBoat() {
        return new Boat();
    }
}

class Person01 {
    private String name;
    private Vehicles vehicles;

    public Person01(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if(!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void common() {
        if (!(vehicles instanceof Horse)) {
            //这里体现多态
            vehicles = VehiclesFactory.getHorse();
        }
        //这里体现接口调用
        vehicles.work();
    }
}


