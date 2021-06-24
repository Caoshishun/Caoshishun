package Homework;

public class Homework03 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.shout();
        Animal b = new Cat();
        b.shout();
    }
}

abstract class Animal {
    public abstract void shout();
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}
