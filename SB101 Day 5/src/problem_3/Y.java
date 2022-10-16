package problem_3;

public class Y implements X {


    @Override
    public int convetStringToNumber(String s) {

        int number = Integer.parseInt(s) ;
        return number;
    }
}
