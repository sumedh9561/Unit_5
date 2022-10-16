package problem_5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {

    public static void main(String[] args) {

        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
            oos.writeObject(new Student(12, "Sagar", 250, "Sagar.gmail.com", "s1234", new Address("Akola", "Akola", "444501")));
            oos.writeObject(new Student(27, "nagesh", 152, "nagesh.gmail.com", "s2234", new Address("Nagpur", "Nagpur", "1001401")));
            oos.writeObject(new Student(33, "pawan", 118, "pawan.gmail.com", "s3234", new Address("Patna", "saba", "123453")));
            oos.writeObject(new Student(24, "nitesh", 195, "nitesh.gmail.com", "s4234", new Address("Bihar", "vallab", "333612")));
            oos.writeObject(new Student(35, "hitesh", 230, "hitesh.gmail.com", "s5234", new Address("kerla", "Nagasaji", "799612")));

            oos.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}