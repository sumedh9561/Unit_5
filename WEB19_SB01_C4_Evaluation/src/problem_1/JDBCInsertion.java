package problem_1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertion {
	

	public static void main(String[] args) {
		
		

		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter sudent roll");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.println("enter sudent name");
		String name=sc.nextLine();
		System.out.println("enter sudent address");
		String address=sc.nextLine();
		System.out.println("enter sudent mobile no");
		String mob=sc.next();
		
		
		String url="jdbc:mysql://localhost:3306/SB101_c4";
		
		try(Connection conn=DriverManager.getConnection(url,"root", "root")){
			
			PreparedStatement pst= conn.prepareStatement("insert into student values(?,?,?,?)");
			
			pst.setInt(1, roll);
			pst.setString(2, name);
			pst.setString(3, address);
			pst.setString(4, mob);
			
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

