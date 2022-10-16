package problem_6;

class X extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("run - "+i);
        }
    }
    public static void main(String args[]){
        X  t1=new X ();
        t1.run();//fine, but does not start a separate call stack
    }
}
