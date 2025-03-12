package java5;

//Main Class - Demonstrates Object Creation & Functionality
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Creating Savings Account
     System.out.print("Enter Savings Account Holder's Name: ");
     String savingsName = sc.nextLine();
     SavingsAccount savings = new SavingsAccount(savingsName, 5000, 5); // ₹5000 balance with 5% interest

     // Creating Current Account
     System.out.print("Enter Current Account Holder's Name: ");
     String currentName = sc.nextLine();
     CurrentAccount current = new CurrentAccount(currentName, 10000, 2000); // ₹10,000 balance with ₹2000 overdraft

     // Displaying Account Details
     System.out.println("\n--- Savings Account Details ---");
     savings.displayDetails();

     System.out.println("\n--- Current Account Details ---");
     current.displayDetails();

     // Performing Transactions
     System.out.println("\n--- Transactions ---");
     savings.deposit(2000);
     current.deposit(3000);
     current.withdraw(13000);

     sc.close();
 }
}
