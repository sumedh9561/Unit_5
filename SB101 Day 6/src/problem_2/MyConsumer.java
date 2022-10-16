package problem_2;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student> {

    @Override
    public void accept(Student t) {

        if(t.getMarks()>500) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

    }

}

