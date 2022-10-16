package problem_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {


    public static void main(String[] args) {


        CollableObj c1[] = new CollableObj[] {

                new CollableObj(13),
                new CollableObj(22),
                new CollableObj(37),
                new CollableObj(45),
                new CollableObj(31),
                new CollableObj(27),


        };

        ExecutorService service = Executors.newFixedThreadPool(3);
        for(CollableObj c:c1) {
            Future<Integer> f= service.submit(c);
            try {
                System.out.println(f.get());

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        service.shutdown();

    }



}
