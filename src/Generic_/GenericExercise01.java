package Generic_;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise01 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("曹世顺",15000,new MyDate(2001,7,13)));
        employees.add(new Employee("张刚",10000,new MyDate(2001,4,23)));
        employees.add(new Employee("王华洲",12000,new MyDate(2001,9,16)));

        System.out.println(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不正确..");
                    return 0;
                }

                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    return i;
                }

                int yearMius = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if (yearMius != 0) {
                    return yearMius;
                }

                int monthMius = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if (monthMius != 0) {
                    return monthMius;
                }

                int dayMius = o1.getBirthday().getDay() - o2.getBirthday().getDay();
                if (dayMius != 0) {
                    return dayMius;
                }
                return 0;
            }
        });

        System.out.println(employees);

    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

