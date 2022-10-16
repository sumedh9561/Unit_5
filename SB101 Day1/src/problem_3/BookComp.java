package problem_3;

import java.util.Comparator;

public class BookComp implements Comparator<Books>{

    int bag=0;
    @Override
    public int compare(Books o1, Books o2) {

        if(o1.bookId>o2.bookId) {

            return  +1;
        }
        if(o1.bookId<o2.bookId) {
//			System.out.println(o2);
//			System.out.println(o1);
//             System.out.println();
            return  +1;
        }
        else
        if(bag>0) {

            System.out.println("these two books were same so we kept the book we entered first ");
            System.out.println();
            System.out.println(o2);
            System.out.println(o1);
            System.out.println();
        }
        bag++;
        return 0;
    }

}

