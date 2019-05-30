package BankManager;

public class Main {
    public static void main(String[] args) {
        SavingsAccount mySavingsAccount = new SavingsAccount();
        CheckingAccount myCheckingAccount = new CheckingAccount();
        COD myCOD = new COD();
        mySavingsAccount.account = "001";
        System.out.println(mySavingsAccount.account);
    }
}
