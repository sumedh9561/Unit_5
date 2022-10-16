package problem_4;

import java.io.Serializable;

public class Student implements Serializable {

    private int roll;
    private String name;
    private int marks;
    private String address;


    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(int roll, String name, int marks, String address) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", address='" + address + '\'' +
                '}';
    }
}
