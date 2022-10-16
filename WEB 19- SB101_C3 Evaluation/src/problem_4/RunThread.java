package problem_4;

public class RunThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            String tname = Thread.currentThread().getName();
            System.out.println(tname + ": is running");
        }
    }

    public static void main(String[] args) {

        Kohli t1 = new Kohli();
        Dhoni t2 = new Dhoni();
        Rohit t3 = new Rohit();

        t1.start();
        t2.start();
        t3.start();

        t2.setPriority(10);
    }
}

class Rohit extends Thread {

    int num = 1;

    public void run() {

        for (int i = 1; i <= 10; i++) {
            num = num * i;
        }
        System.out.println("Rohit Thread : " + num);
    }
}

class Kohli extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Kohli Thread :" + i);
        }
    }
}

class Dhoni extends Thread {

    public void run() {

        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }
        System.out.println("Dhoni Thread : " + sum);
    }
}