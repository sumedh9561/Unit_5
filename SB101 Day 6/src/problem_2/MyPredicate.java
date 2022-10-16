package problem_2;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Student> {

    @Override
    public boolean test(Student s) {
        if(s.getMarks()>500)return true;
        else return false;
    }

}

