package problem_1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertionCourse {

	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter course cid");
	int cid=sc.nextInt();
	sc.nextLine();
	System.out.println("enter course cname");
	String cname=sc.nextLine();
	System.out.println("enter course fee");
	int fee=sc.nextInt();
	sc.nextLine();
	System.out.println("enter course duration ");
	String duration=sc.nextLine();
	
	
	String url="jdbc:mysql://localhost:3306/SB101_c4";
	
	try(Connection conn=DriverManager.getConnection(url,"root", "root")){
		
		PreparedStatement pst= conn.prepareStatement("insert into course values(?,?,?,?)");
		
		pst.setInt(1, cid);
		pst.setString(2, cname);
		pst.setInt(3, fee);
		pst.setString(4, duration);
		
		int x=pst.executeUpdate();
		
		if(x>0) {
			System.out.println("record inserted");
		}else {
			System.out.println("record not inserted");
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
}
