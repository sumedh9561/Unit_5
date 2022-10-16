package problem_1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentEnroll {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/SB101_c4";
		
		try(Connection conn=DriverManager.getConnection(url,"root", "root")){
			
			//inserting course details
			PreparedStatement ps1= conn.prepareStatement("insert into course values(1,'Java','20000','3 months')");
			PreparedStatement ps2= conn.prepareStatement("insert into course values(2,'Spring','15000','2 months')");
			PreparedStatement ps3= conn.prepareStatement("insert into course values(3,'Hybernate','10000','1 months')");
			PreparedStatement ps4= conn.prepareStatement("insert into course values(4,'React','25000','4 months')");
			PreparedStatement ps5= conn.prepareStatement("insert into course values(5,'Angular','35000','6 months')");
//			
			ps1.executeUpdate();
			ps2.executeUpdate();
			ps3.executeUpdate();
			ps4.executeUpdate();
			ps5.executeUpdate();
			
			//inserting student details
			PreparedStatement ps6= conn.prepareStatement("insert into student values(1,'Venkat','Nagpur','12345678')");
			PreparedStatement ps7= conn.prepareStatement("insert into student values(2,'Amit','Pune','23456789')");
			PreparedStatement ps8= conn.prepareStatement("insert into student values(3,'Raj','Hydrabad','3456789')");
			PreparedStatement ps9= conn.prepareStatement("insert into student values(4,'Binay','Banglore','4567890')");
		   PreparedStatement ps10= conn.prepareStatement("insert into student values(5,'Suresh','Bhopal','5678901')");
			
//			ps6.executeUpdate();
//			ps7.executeUpdate();
//			ps8.executeUpdate();
//			ps9.executeUpdate();
		   ps10.executeUpdate();
			
			//enrolling students
			
			//enrolling Amit in Java and Spring.
			PreparedStatement e1 = conn.prepareStatement("insert into student_course values(2,1)");
			PreparedStatement e2= conn.prepareStatement("insert into student_course values(2,2)");
			e1.executeUpdate();
			e2.executeUpdate();
			
			//enrolling Venkat in Java and React.
			PreparedStatement e3 = conn.prepareStatement("insert into student_course values(1,1)");
			PreparedStatement e4= conn.prepareStatement("insert into student_course values(1,4)");
			e3.executeUpdate();
			e4.executeUpdate();
			
			//enrolling Raj in Spring and Angular
			PreparedStatement e5 = conn.prepareStatement("insert into student_course values(3,2)");
			PreparedStatement e6= conn.prepareStatement("insert into student_course values(3,5)");
			e5.executeUpdate();
			e6.executeUpdate();
			
			//enrolling Suresh in Java, Hibernate and React.
			PreparedStatement e7 = conn.prepareStatement("insert into student_course values(5,1)");
			PreparedStatement e8= conn.prepareStatement("insert into student_course values(5,3)");
			PreparedStatement e9= conn.prepareStatement("insert into student_course values(5,4)");
			e7.executeUpdate();
			e8.executeUpdate();
			e9.executeUpdate();
			
			//enrolling Binay in React.
			PreparedStatement e10= conn.prepareStatement("insert into student_course values(4,4)");
			e10.executeUpdate();
			
			
				System.out.println("records inserted");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
