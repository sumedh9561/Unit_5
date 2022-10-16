package problem_3;

import java.util.concurrent.Callable;
public class CollableObj implements Callable<Integer> {

    int num;
    public CollableObj(int n) {
        this.num=n;
    }
    int bag=1;
    @Override
    public Integer call() throws Exception{
        for(int i=1;i<=num;i++) {
            bag=bag*i;
        }
        return bag;
    }
}