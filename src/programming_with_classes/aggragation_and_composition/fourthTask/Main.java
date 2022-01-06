package programming_with_classes.aggragation_and_composition.fourthTask;

import java.util.Arrays;

/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Main {
    public static void main(String[] args) {
       Person john = new Person( "John");
        BankAccount firstAccount = new BankAccount(john, 150000, true);
        BankAccount secondAccount = new BankAccount(john, 50000, true);
        BankAccount blockedAccount = new BankAccount(john, 40000, false);

        firstAccount.deposit(5000);
        System.out.println(firstAccount.getBalance());

        firstAccount.transferMoney(blockedAccount, 5000);
        //Error
        firstAccount.transferMoney(secondAccount, 50000);
        System.out.println(firstAccount.getBalance() + " " + secondAccount.getBalance());

        Person peter = new Person("Peter");
        BankAccount treasury = new BankAccount(peter, 80000, true);

        System.out.println();
        System.out.println(BankAccount.findById(2));

     System.out.println(Arrays.toString(BankAccount.sortById(new BankAccount[]{treasury, secondAccount, firstAccount, blockedAccount})));
     System.out.println(Arrays.toString(BankAccount.sortByBalance(new BankAccount[]{treasury, secondAccount, firstAccount, blockedAccount})));

        System.out.println(BankAccount.getGeneralBalance(2));

        blockedAccount.changeActivity();
        blockedAccount.withdrawal(500000);

        System.out.println(BankAccount.getPositiveBalance(1));
        System.out.println(BankAccount.getNegativeBalance(1));

    }
}
