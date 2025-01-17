package ms.prac;
import java.util.*;

public class Binary_decimal {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary String:- ");
		String binary=sc.next();
		
		int decimal=conversion(binary);
		System.out.println("The Decimal Conversion of Binary String is :-"+decimal);
	}
	
	public static int conversion(String binaryString) {
		int num=0;
		try {
			num=Integer.parseInt(binaryString,2);			
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		return num;
	}
}
