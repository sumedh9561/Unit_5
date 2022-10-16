package problem_1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchingStudent {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner (System.in);
		
		
	    System.out.println("enter student roll");
	    int roll=sc.nextInt();
	    
	    String url="jdbc:mysql://localhost:3306/SB101_c4";
	    
try(Connection conn=DriverManager.getConnection(url,"root", "root")){
			
			PreparedStatement pst= conn.prepareStatement(" select * from student s inner join course c inner join student_course sc on sc.roll2=s.roll and c.cid=sc.cid2 and s.roll=?");
			
			pst.setInt(1, roll);
			ResultSet rs=pst.executeQuery();
			
			
			boolean flag=true;
				while(rs.next()) {
				flag=false;
				int r=rs.getInt("roll");
				String n=rs.getString("name");
				String add=rs.getString("address");
				String mob=rs.getString("mobile");
				int cid=rs.getInt("cid");
				String cn=rs.getString("cname");
				String fee=rs.getString("fee");
				String du=rs.getString("duration");
				System.out.println(" roll | name   | address  | mobile    | cid | cname | fee   | duration ");
				System.out.println(r +"| "+n  + "|"+ add  +"|"+ mob   + "| "+cid +"|"+ cn +"| "+fee +"  |"+du+" |");
				
				System.out.println( "---------------------------------------------------------------------------" );
			}
			if(flag) {
				System.out.println("No record found");
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}
	
}
