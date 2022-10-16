package problem_3;

class ThreadB extends Thread {

    public void run(){

        for(int i=1;i<20;i=i+2)
            System.out.println("odd number "+i);
    }
}
