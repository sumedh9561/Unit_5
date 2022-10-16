package problem_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class Demo2 {


    public static void main(String[] args) {

        List<Student> l1=new ArrayList<>();

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentdata.txt"));

            Object obj1=ois.readObject();
            while(obj1!=null) {
                l1.add((Student) obj1);
                System.out.println((Student) obj1);
                obj1=ois.readObject();
            }
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
        }

        l1.add(new Student(67, "Saurabh", 248, "Saurabh.gmail.com", "Djmpa27", new Address("Maharastra", "murtijapur", "1000112")));


        try {
//
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
            for(Student stu:l1) {

                oos.writeObject(stu);
            }

            oos.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}