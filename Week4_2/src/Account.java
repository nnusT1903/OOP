import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    /**
     * Constructor.
     */
    Account() {
        this.balance = 0;
        this.transitionList = new ArrayList<Transaction>();
    }

    /**
     * Second Constructor.
     */
    Account(double balance) {
        this.balance = balance;
        this.transitionList = new ArrayList<Transaction>();
    }

    private void deposit(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        balance += amount;
        transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
    }

    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        balance -= amount;
        transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
    }

    /**
     * Add a transaction to account.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Print the TransitionList of the Account.
     */
    public void printTransaction() {
        int count = 0;
        for (Transaction transaction : transitionList) {
            count++;
            if (transaction.getOperation().equals(Transaction.DEPOSIT)) {
                System.out.printf("Giao dich %d: Nap tien $%.2f. So du luc nay: $%.2f.",
                        count, transaction.getAmount(), transaction.getBalance());
            } else {
                System.out.printf("Giao dich %d: Rut tien $%.2f. So du luc nay: $%.2f.",
                        count, transaction.getAmount(), transaction.getBalance());
            }
            System.out.print("\n");
        }
    }
}
