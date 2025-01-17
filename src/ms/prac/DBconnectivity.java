package ms.prac;

import java.sql.*;
import java.util.*;
public class DBconnectivity {
	public static Connection con=null;
	public static Connection dbcon() {
		String url="jdbc:mysql://localhost:3306/task1";
		String name="root";
		String pass="";
		if(con==null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection(url,name,pass);
				System.out.println("connection successful...!!!");
			}
			catch(ClassNotFoundException e) {
				System.out.println("Connection Failed...!!"+e);
			}
			catch(SQLException e) {
				System.out.print("Sql Exception"+e);
			}
			catch(Exception e) {
				System.out.println("An Error Occured");
			}
		}
		return con;
	}
}
