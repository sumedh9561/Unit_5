package problem_7;

public class Main implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            String tname=Thread.currentThread().getName();

            System.out.println(tname +"is running");
        }
    }
    public static void main(String[] args){
        Main tc=new Main();
        Thread one=new Thread(tc);
        Thread two=new Thread(tc);
        one.setPriority(8);
        two.setPriority(10);
        one.setName("Dhoni ");
        two.setName("Kohli ");
        one.start();
        two.start();
    }
}