package ms.prac;
import ms.prac.DBconnectivity;
import java.sql.*;
import java.util.*;


public class deleteExpense {
	public static void DeleteExpense(int id) {
		String query="Delete from expenses where id=?";
		try {
			Connection con=DBconnectivity.dbcon();
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of the Expense to be deleted :- ");
		int id =sc.nextInt();
		
		DeleteExpense(id);
	}
}
