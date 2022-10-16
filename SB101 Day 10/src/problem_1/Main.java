package problem_1;

public class Main {
    public static void main(String[] args)throws Exception {
        Calculate tc=new Calculate();
        tc.start();

       synchronized (tc) {
            tc.wait();
            System.out.println("Poduct of 1 to 10 No :- "+tc.prod);
        }
    }
}
