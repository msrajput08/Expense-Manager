package ms.prac;
import ms.prac.DBconnectivity;

import java.sql.*;
import java.util.*;

public class EditExpense {
	public static void editExpense(int id,double amount,String date){
		String query="Update expenses set amount=?,date=? where id=?";
		try {
		Connection con=DBconnectivity.dbcon();
		PreparedStatement ps=con.prepareStatement(query);
		ps.setDouble(1, amount);
		ps.setDate(2, java.sql.Date.valueOf(date));
		ps.setInt(3, id);
		ps.executeUpdate();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of the Expense to be updated :- ");
		int id=sc.nextInt();
		
		System.out.println("Enter the updated amount:- ");
		double amount=sc.nextDouble();
		
		System.out.println("Enter the updated date(yyyy-mm-dd) :- ");
		String date=sc.next();
		
		editExpense(id,amount,date);
	}
}