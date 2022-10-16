package problem_4;

import java.io.*;
import java.util.Set;


public class Demo {

    public static void main(String[] args) throws Exception{

        Student s1=new Student(10,"shivraj",300,"abc@gmail.com");
        Student s2=new Student(22,"rohit",400,"abcd@gmail.com");
        Student s3=new Student(34,"pankaj",500,"abcde@gmail.com");
        Student s4=new Student(41,"mahesh",600,"def@gmail.com");
        Student s5=new Student(57,"swapnil",700,"swap@gmail.com");


        StudentDB a1=new StudentDB();
        a1.addStudent(s1);
        a1.addStudent(s2);
        a1.addStudent(s3);
        a1.addStudent(s4);
        a1.addStudent(s5);


        FileOutputStream fos=new FileOutputStream("Studentdata.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(a1);

        oos.flush();
        oos.close();

        FileInputStream fis=new FileInputStream("Studentdata.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Object obj=ois.readObject();

        StudentDB objDB=(StudentDB) obj;

        Set<Student> set= objDB.studentData;

        for(Student student:set){
            System.out.println(student);
        }

        ois.close();
    }
}

