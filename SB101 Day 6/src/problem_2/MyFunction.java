package problem_2;


import java.util.function.Function;

public class MyFunction implements Function<Student,Student> {

    @Override
    public Student apply(Student t) {
        t.setMarks(t.getMarks()+10);
        return t;
    }





}

