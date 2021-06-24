package Enumeration;

public class Test {
    public static void main(String[] args) {
        Week[] week = Week.values();
        System.out.println("=================");
        for(Week day: week) {
            System.out.println(day.getName());
        }
    }
}

enum Week {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
