package programming_with_classes.aggragation_and_composition.fourthTask;

import java.util.ArrayList;

public class BankAccount {
    private int ownerId;
    private String ownerName;
    private int number;
    private long balance;
    private boolean isActive;
    private static int numberCounter = 1;
    private static ArrayList<BankAccount> accountsBase = new ArrayList();

    public BankAccount(Person owner, long balance, boolean isActive) {
        this.ownerId = owner.getId();
        this.ownerName = owner.getName();
        this.number = numberCounter;
        this.balance = balance;
        this.isActive = isActive;
        numberCounter++;
        accountsBase.add(this);
    }

    public static BankAccount[] sortById(BankAccount[] accounts) {
        for (int i = 0; i < accounts.length - 1; i++) {
            for (int j = i + 1; j < accounts.length; j++) {
                if (accounts[i].number > accounts[j].number) {
                    BankAccount temp = accounts[i];
                    accounts[i] = accounts[j];
                    accounts[j] = temp;
                }
            }
        }
        return accounts;
    }

    public static BankAccount[] sortByBalance(BankAccount[] accounts) {
        for (int i = 0; i < accounts.length - 1; i++) {
            for (int j = i + 1; j < accounts.length; j++) {
                if (accounts[i].balance > accounts[j].balance) {
                    BankAccount temp = accounts[i];
                    accounts[i] = accounts[j];
                    accounts[j] = temp;
                }
            }
        }
        return accounts;
    }

    public static long getGeneralBalance(int ownerId) {
        if (ownerId > Person.getCounterID()) {
            System.out.println("Owner not found!");
            return 0;
        }
        long sum = 0;
        for (BankAccount account :
                accountsBase) {
            if (account.isActive && account.ownerId == ownerId) sum += account.balance;
        }
        return sum;
    }

    public static BankAccount findById(int accountId) {
        for (BankAccount account: accountsBase) {
            if (account.number == accountId) return account;
        }
        System.out.println("Error! Account not found!");
        return null;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getBalance() {
        return balance;
    }


    public boolean isActive() {
        return isActive;
    }

    public void deposit(long deposit){
        if (this.isActive) {
            this.balance += deposit;
        } else {
            System.out.println("Error! Account is blocked!");
        }
    }

    public void withdrawal(long withdrawal) {
        if (this.isActive) {
            this.balance -= withdrawal;
        } else {
            System.out.println("Error! Account is blocked!");
        }
    }

    public static long getPositiveBalance(int ownerId) {
        if (ownerId > Person.getCounterID()) {
            System.out.println("Owner not found!");
            return 0;
        }
        long sum = 0;
        for (BankAccount account :
                accountsBase) {
            if (account.isActive && account.ownerId == ownerId && account.balance > 0) sum += account.balance;
        }
        return sum;
    }

    public static long getNegativeBalance(int ownerId) {
        if (ownerId > Person.getCounterID()) {
            System.out.println("Owner not found!");
            return 0;
        }
        long sum = 0;
        for (BankAccount account :
                accountsBase) {
            if (account.isActive && account.ownerId == ownerId && account.balance < 0) sum += account.balance;
        }
        return sum;
    }

    public void transferMoney(BankAccount to, long money) {
        if (!(this.isActive && to.isActive)) {
            System.out.println("Error! One of the accounts is blocked!");
            return;
        }
        if (money > this.balance) {
            System.out.println("Not enough funds!");
            return;
        }
        this.balance -= money;
        to.balance += money;
    }

    public void changeActivity() {
        if (this.isActive) {
            this.isActive = false;
            System.out.println("Account is deactivated!");
        } else {
            this.isActive = true;
            System.out.println("Account is activated!");
        }
    }

    @Override
    public String toString() {
        return ownerName + "'s bank account (Owner ID " + ownerId + ")\nAccount number is " + number + "\nBalance = " + balance + "\nActive: " + isActive;
    }
}
