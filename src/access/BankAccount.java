package access;

public class BankAccount {

    private int balance;

    // command + G : ctrl + alt + G ; Generater


    public BankAccount() {
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액 또는 잔액 부족");
        }
    }

    public int getBalance() {
        return balance;
    }

    // private 메서드
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
