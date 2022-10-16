package problem_2;


public class Student {

    int Roll;
    String  name;
    int Marks;


    // Constructor
    public Student(int Roll ,String name , int Marks)
    {
        this.Roll = Roll;
        this.name = name;
        this.Marks = Marks;

    }


    public String toString()
    {
        return this.Roll + " " + this.name + " " + this.Marks;
    }
}

