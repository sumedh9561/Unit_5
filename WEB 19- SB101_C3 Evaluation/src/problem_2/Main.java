package problem_2;

public class Main {
    public static void main(String[] args)throws Exception {
        ThreadA tc=new ThreadA();
        tc.start();

        synchronized (tc) {
            tc.wait();
            System.out.println("Poduct of 1 to 10 No :- "+tc.prod);
        }
    }
}
