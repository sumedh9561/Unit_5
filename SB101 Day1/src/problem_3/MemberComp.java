package problem_3;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class MemberComp implements Comparator<Members>{

    int bag=0;
    @Override
    public int compare(Members m1, Members m2) {


//		System.out.println(m1);
//		System.out.println(m2);
        if(m1.memberId==m2.memberId) {
            if(bag>0) {
                System.out.println();
                System.out.println(m2);
                System.out.println(m1);

                System.out.println("both of these entryes had common memberId so we kept the first one");
            }
            bag++;
            return 0;
        }
        else if(m1.membershipNo==m2.membershipNo) {
            System.out.println(m1);
            System.out.println(m2);
            System.out.println("both of these entryes had common membershipNo so we kept the first one");
            return 0;
        }
        else {
            return  +1;
        }

    }

}

