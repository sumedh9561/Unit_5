package problem_4;

import java.io.Serializable;
import java.util.*;


public class StudentDB implements Serializable {

    public Set<Student> studentData =new LinkedHashSet<>();

    public void addStudent(Student student){

        studentData.add(student);

    }

}
