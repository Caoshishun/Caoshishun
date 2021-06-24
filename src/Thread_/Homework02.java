package Thread_;

public class Homework02 {
    public static void main(String[] args) {
        Money money1 = new Money();
        Money money2 = new Money();
        money1.start();
        money2.start();

    }
}

class Money extends Thread {
    private static int money = 10000;

    @Override
    public void run() {
        synchronized (Money.class) {
            while (true) {
                if (money <= 0) {
                    break;
                }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    money -= 1000;
                    System.out.println(Thread.currentThread().getName() + " 取出1000,剩下 " + money);

            }
        }
    }
}
