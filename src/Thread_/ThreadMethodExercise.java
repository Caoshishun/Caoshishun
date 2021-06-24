package Thread_;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        Thread hello = new Hello();


        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + (++count));
            if (i == 5) {
                hello.start();
                hello.join();
            }
        }

    }
}

class Hello extends Thread {
    private int count = 0;

    @Override
    public void run() {
        super.run();
        while (count < 10) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello" + (++count));

        }
    }
}
