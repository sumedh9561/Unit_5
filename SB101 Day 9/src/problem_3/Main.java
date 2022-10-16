package problem_3;



class Main {

    public static void main(String[] args) throws InterruptedException {

        ThreadA o =new ThreadA();
        ThreadB e=new ThreadB();

        o.start();
        e.start();

        o.join();
        e.join();

    }
}

