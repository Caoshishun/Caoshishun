package Thread_;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Print print = new Print();
        Q q = new Q(print);
        print.start();
        q.start();

    }
}

class Print extends Thread{
    private boolean loop = true;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {

        while (loop) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((int) (Math.random() * 100 + 1));
        }

    }
}

class Q extends Thread {
    private Print print;
    private Scanner scanner = new Scanner(System.in);

    public Q(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入Q表示退出:");
            char key = scanner.next().toUpperCase().charAt(0);
            if(key == 'Q') {
                print.setLoop(false);
                System.out.println("打印进程退出。");
                break;
            }
        }
    }
}