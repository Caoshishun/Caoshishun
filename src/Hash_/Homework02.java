package Hash_;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        Car car1 = new Car("宾利", 500000);
        Car car2 = new Car("宝马",400000);

        arrayList.add(car1);
        arrayList.add(car2);
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        //查找元素是否存在。
        System.out.println(arrayList.contains(car1));

        //判断是否为空。
        System.out.println(arrayList.isEmpty());

        //添加多个元素,及添加一个arraylist
        arrayList.addAll(arrayList);
        System.out.println(arrayList);

        System.out.println("====================");
        for (Object next : arrayList) {
            Car car = (Car) next;
            System.out.println(car);
        }

        System.out.println("=====================");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }


    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
