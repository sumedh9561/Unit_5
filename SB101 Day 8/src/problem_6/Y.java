package problem_6;

public class Y extends Thread{
public void run(){
        for(int i=1;i<10;i++){
        try
            {Thread.sleep(500);}
        catch
             (InterruptedException e)
             {System.out.println(e);}
            System.out.println(i);
         }
        }
public static void main(String args[]){
        Y t1=new Y();
        Y t2=new Y();

        t1.run();
        t2.run();
        }
        }