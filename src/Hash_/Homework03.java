package Hash_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Homework03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        Employee_ employee = new Employee_("Jack", 650);
        Employee_ employee1 = new Employee_("Smith", 2900);
        map.put(employee.getName(), employee.getPrice());
        map.put(employee1.getName(), employee1.getPrice());
        System.out.println(map);

        //修改value值可以用put 替换
        map.put(employee.getName(), (Integer) employee.getPrice() + 100);


        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        for (Object o : map.keySet()) {
            map.put(o, (Integer) map.get(o) + 100);
            System.out.println(o);
        }


        Iterator iterator1 = map.values().iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }

        for (Object o : map.values()) {
            System.out.println(o);
        }


    }

}

class Employee_ {
    private String name;
    private int price;

    public Employee_(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Employee_{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
