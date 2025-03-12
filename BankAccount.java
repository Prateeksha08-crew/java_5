package java5;
//Abstract Class - Demonstrates Abstraction & Encapsulation
abstract class BankAccount {
 private String accountHolder;
 protected double balance;

 // Constructor
 public BankAccount(String accountHolder, double initialBalance) {
     this.accountHolder = accountHolder;
     this.balance = initialBalance;
 }

 // Abstract method (Abstraction)
 public abstract void deposit(double amount);

 // Concrete method to display account details
 public void displayDetails() {
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Balance: ₹" + balance);
 }
}
