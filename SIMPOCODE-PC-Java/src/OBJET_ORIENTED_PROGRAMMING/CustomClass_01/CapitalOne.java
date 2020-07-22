package OBJET_ORIENTED_PROGRAMMING.CustomClass_01;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Jean = new BankAccount();
        Jean.accountHolder = "Jean Michel Chauvet";
        Jean.accountNumber = 381765992;

        Jean.checkingBalance();
        Jean.deposit(3000);
        Jean.withDraw(500);
        Jean.checkingBalance();
        Jean.printData();

    }
}
