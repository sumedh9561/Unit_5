package com.masai.problem_3;

import java.util.Objects;

public class Student {

    private int roll;
    private String name;
    private int marks;
    private String address;

    public Student() {
        // TODO Auto-generated constructor stub
    }

    public Student(int roll, String name, int marks, String address) {
        super();
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.address = address;
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(address, marks, name, roll);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return Objects.equals(address, other.address) && marks == other.marks && Objects.equals(name, other.name)
                && roll == other.roll;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
    }



}