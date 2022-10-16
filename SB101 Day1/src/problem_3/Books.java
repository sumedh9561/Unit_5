package problem_3;


import java.lang.reflect.Member;
import java.util.Objects;
import java.util.TreeSet;

public class Books {

    int bookId;
    String bookName;
    String BookAuthor;

    public static void main(String[] args) {

        Library l1= new Library();

        l1.Al.add(new Books(1,"abc","dfc"));
        l1.Al.add(new Books(4,"abw","asc"));
        l1.Al.add(new Books(3,"asc","ddc"));
        l1.Al.add(new Books(4,"arc","hhc"));
        l1.Al.add(new Books(5,"sdc","vbc"));

        System.out.println("Books in Library");
        System.out.println();
        for(Books b: l1.Al) {
            System.out.println(b);
        }

        l1.M1.add(new Members(1, "m1", 123, "01-11-2022"));
        l1.M1.add(new Members(2, "m2", 456, "11-05-2022"));
        l1.M1.add(new Members(3, "m3", 783, "05-11-2023"));
        l1.M1.add(new Members(4, "m4", 903, "07-12-2022"));
        l1.M1.add(new Members(5, "m5", 112, "03-09-2024"));
        l1.M1.add(new Members(4, "m4", 944, "01-10-2022"));

        TreeSet<Members> m2=new TreeSet<>(new MemberCompDate());

        System.out.println();
        for(Members m: l1.M1) {
//			System.out.println(m);
            m2.add(m);
        }

        for(Members m:m2) {
            System.out.println(m);
        }


    }

    @Override
    public int hashCode() {
        return Objects.hash(BookAuthor, bookId, bookName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Books other = (Books) obj;
        return  bookId == other.bookId;
    }

    @Override
    public String toString() {
        return "Books [bookId=" + bookId + ", bookName=" + bookName + ", BookAuthor=" + BookAuthor + "]";
    }

    public Books(int bookId, String bookName, String bookAuthor) {
        super();
        this.bookId = bookId;
        this.bookName = bookName;
        BookAuthor = bookAuthor;
    }
}

