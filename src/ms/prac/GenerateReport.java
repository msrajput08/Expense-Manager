package ms.prac;
import java.sql.*;
import java.text.SimpleDateFormat;

import ms.prac.DBconnectivity;

public class GenerateReport {
	public static void main(String args[]) {
		String query="Select * from expenses";
		double totalExpenses = 0;
		try {
			Connection con=DBconnectivity.dbcon();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next()) {
				int id=rs.getInt("id");
				double amount=rs.getDouble("amount");
				String category=rs.getString("category");
				String Date=rs.getDate("date").toString();
				
				System.out.printf("ID: %d | Amount: %.2f | Category: %s | Date: %s\n", id, amount, category,Date);

				totalExpenses += amount; 
				} 
			System.out.println("-------------------------------------------------");
			System.out.printf("Total Expenses: %.2f\n", totalExpenses);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
