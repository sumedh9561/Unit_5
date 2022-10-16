package problem_3;


public class AccountDemo {

    public static void main(String[] args) {

        Account ac=new Account("123456",600);
        ac.deposit(100);
        try {
            ac.withdraw(500);
        } catch (InsufficientFundsException e) {
            // TODO Auto-generated catch block
            System.out.println("hii");
            e.getMessage();
        }
        try {
            ac.withdraw(300);
        } catch (InsufficientFundsException e) {
            // TODO Auto-generated catch block
//			System.out.println("bye");
            System.out.println(e.getMessage());
//			);
        }
    }

}
