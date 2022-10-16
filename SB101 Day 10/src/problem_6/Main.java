package problem_6;

//public class Main {
//
//    public static void main(String[] args) {
//
//
//        ThreadA oep = new ThreadA();
//        ThreadB o = new ThreadB();
//
//
//        oep.odd = true;
//        Thread t1 = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                o.printEven();
//
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                oep.printOdd();
//
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {

    public static void main(String[] args) throws Exception {
        MyCallable1[] jobs = {
                              new MyCallable1(1),
                              new MyCallable1(2),
                              new MyCallable1(3),
                              new MyCallable1(4),
                              new MyCallable1(5),
                              new MyCallable1(6)
                                                      };


        ExecutorService service = Executors.newFixedThreadPool(3);

        for (MyCallable1 job : jobs) {
            Future<String> f = service.submit(job);
            System.out.println(f.get());
        }

        service.shutdown();
    }
}