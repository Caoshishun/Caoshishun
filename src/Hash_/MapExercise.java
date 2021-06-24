package Hash_;

import java.util.*;

@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Employee02 num1 = new Employee02("曹世顺", 12000, 23);
        Employee02 num2 = new Employee02("张刚", 9000, 55);
        Employee02 num3 = new Employee02("王华洲", 10000, 78);
        hashMap.put(num1.getId(),num1);
        hashMap.put(num2.getId(),num2);
        hashMap.put(num3.getId(),num3);

        Set keyset = hashMap.keySet();
        for (Object o : keyset) {
            System.out.println(o + "-" + hashMap.get(o));
        }

        System.out.println("----------------------------------");

        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            //hashMap.get(key) 返回values
            System.out.println(next + "-" +hashMap.get(next));
        }

        System.out.println("----------------------------------");

        Collection values = hashMap.values();
        for (Object o : values) {
            System.out.println("o=" + o);
        }

        System.out.println("----------------------------------------");

        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println("next=" + next);
        }

        //通过EntrySet 来获取 K-V.
        Set entrySet= hashMap.entrySet();
        //将entry 转成Map.Entry
        //用get.Key(),getValue()分别获得key和values.
        System.out.println("---------------------------------------");
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

        System.out.println("----------------------------------------");

        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            System.out.println(next);
        }


    }
}

class Employee02 {
    private String name;
    private double sal;
    private int id;

    public Employee02(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee02{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
