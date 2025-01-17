package ms.prac;
import java.sql.*;
import ms.prac.DBconnectivity;
import java.util.*;

public class AddExpense {
	public static void addExpense(double amount,String category,String date) {
	try {
	Connection con=DBconnectivity.dbcon();
	PreparedStatement ps=con.prepareStatement("Insert into expenses(amount,category,date) values(?,?,?)");
	ps.setDouble(1,amount);
	ps.setString(2, category);
	ps.setDate(3, java.sql.Date.valueOf(date));
	ps.executeUpdate();
	System.out.println("Added Successfully");
}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Amount Spent :-");
		double amt=sc.nextDouble();
		System.out.println("Enter The Category :- ");
		String cat=sc.next();
		System.out.println("Enter The Date(yyyy-mm-dd):- ");
		String date=sc.next();
		
		addExpense(amt,cat,date);
	}
}
