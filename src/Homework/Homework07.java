package Homework;

public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car(20);
        car.getAir().flow();
        car.setTemperature(50);
        car.getAir().flow();
        car.setTemperature(-1);
        car.getAir().flow();
    }
}

class Car {
    private int temperature;

    public Car(int temperature) {
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("吹冷风");
            } else if (temperature < 0) {
                System.out.println("吹暖气");
            } else {
                System.out.println("关掉空调");
            }
        }
    }

    public Air getAir() {
        return new Air();
    }
}