package OBJET_ORIENTED_PROGRAMMING.CustomClass_01;
 /*
    practice task:
    create a custom class for bank account
      attributes: accountHolder, accountNumber, balance
      actions: checkingBalance(), withDraw( amount ), deposit( amount )
     */

public class BankAccount {
    //Instance variables
    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance() { System.out.println("Available balance: " +balance); }

    public void withDraw(double amount) { System.out.println("WithDrawing$ = " + amount);balance-=amount; }

    public void deposit(double amount) { System.out.println("Depositing$ = " + amount);balance+=amount; }

    public String printData() {
        String result ="Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nBalance: "+balance;
        return result;
    }
}
