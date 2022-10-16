package problem_3;

class ThreadA extends Thread {

    public void run(){

        for(int i=2;i<20;i=i+2)
            System.out.println("even number "+i);
    }
}
