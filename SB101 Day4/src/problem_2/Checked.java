package problem_2;


public class Checked {

    static int fun1(int a,int b) {
        int c=a+b;

        if(c>5) {
            return c;
        }else {
            ArithmeticException ae= new ArithmeticException();
            throw ae;
        }

    }

    public static void main(String[] args) {


        fun1(5,7);
        // here answer comes 10 which returns 10 and have no problem.


        try {
            fun1(1,2);
            // here answer comes 3 which returns ArithmeticException thats why it needs try-catch block to end program normally
        } catch (Exception e) {
            // TODO: handle exception
        }


    }

}