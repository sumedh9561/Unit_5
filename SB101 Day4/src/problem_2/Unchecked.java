package problem_2;


public class Unchecked {

    static int fun1(int a,int b) throws ClassNotFoundException {
        int c=a+b;

        if(c>5) {
            return c;
        }else {
            ClassNotFoundException CNF= new ClassNotFoundException();
            throw CNF;
            // here throws is mandatory
        }

    }

    public static void main(String[] args) {


        try {
            fun1(5,7);
        } catch (ClassNotFoundException e1) {

            e1.printStackTrace();
        }

        try {
            fun1(1,2);
        } catch (Exception e) {

        }

        // here in both method calling no matter c>5 or not it will need try-Catch block becouse CNF is checked type of exception
        // and i have already mentioned ,in checked type of exceptions try-catch blocks are mandatory.

    }

}

