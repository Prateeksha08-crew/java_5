package java5;

//Child Class - Demonstrates Inheritance & Polymorphism
class CurrentAccount extends BankAccount {
 private double overdraftLimit;

 // Constructor
 public CurrentAccount(String accountHolder, double initialBalance, double overdraftLimit) {
     super(accountHolder, initialBalance); // Calls parent constructor
     this.overdraftLimit = overdraftLimit;
 }

 // Overriding deposit method (Polymorphism)
 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
 }

 // Custom method for overdraft feature
 public void withdraw(double amount) {
     if (amount <= balance + overdraftLimit) {
         balance -= amount;
         System.out.println("Withdrew ₹" + amount + ". Remaining Balance: ₹" + balance);
     } else {
         System.out.println("❌ Transaction failed! Exceeded overdraft limit.");
     }
 }
}
