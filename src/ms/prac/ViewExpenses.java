package ms.prac;
import ms.prac.DBconnectivity;
import java.sql.*;

public class ViewExpenses {
	public static void main(String args[]) {
		String query="select * from expenses";
		try {
			Connection con=DBconnectivity.dbcon();
			Statement cs=con.createStatement();
			ResultSet rs=cs.executeQuery(query);
			while(rs.next()) {
				System.out.println("id :-"+rs.getInt("id")+"\t Amount :- "+rs.getDouble("amount")+"\t Category :- "+rs.getString("category")+"\t Date :- "+rs.getString("date"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
} 
