package problem_6;



public class Child extends Parent{

    Child() throws Exception {
        super();
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        try {
            Parent p=new Parent();
            p.fun1();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
