package ms.prac;

import java.util.Scanner;
import ms.prac.AddExpense;
import ms.prac.deleteExpense;
import ms.prac.EditExpense;
import ms.prac.ViewExpenses;

public class MainMenu {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("\t===========Menu===========\t");
            System.out.println("\t1. Binary To Decimal Conversion");
            System.out.println("\t2. Manage Expenses");
            System.out.println("\t3. Exit");
            System.out.println("\nEnter Your Choice :-");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    Binary_decimal.main(null);
                    break;
                case 2:
                    manage_expenses();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void manage_expenses() {
        boolean run = true;
        while (run) {
            System.out.println("\t==========Expense Manager==========\t");
            System.out.println("\t1. Add Expense");
            System.out.println("\t2. Edit Expense");
            System.out.println("\t3. Delete Expense");
            System.out.println("\t4. View Expense");
            System.out.println("\t5. Generate Expense Report");
            System.out.println("\t6. Return to Main Menu");
            System.out.println("Enter your choice :-");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    AddExpense.main(null);
                    break;
                case 2:
                    EditExpense.main(null);
                    break;
                case 3:
                    deleteExpense.main(null);
                    break;
                case 4:
                    ViewExpenses.main(null);
                    break;
//                case 5:
//                    GenerateReport.main(null);
//                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
