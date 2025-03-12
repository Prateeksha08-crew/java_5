package java5;
//Child Class - Demonstrates Inheritance & Polymorphism
class SavingsAccount extends BankAccount {
 private double interestRate;

 // Constructor
 public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
     super(accountHolder, initialBalance);  // Calls parent constructor
     this.interestRate = interestRate;
 }

 // Overriding deposit method (Polymorphism)
 @Override
 public void deposit(double amount) {
     balance += amount + (amount * interestRate / 100);
     System.out.println("Deposited ₹" + amount + " with interest. New Balance: ₹" + balance);
 }
}
