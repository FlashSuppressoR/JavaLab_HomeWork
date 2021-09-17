package Lesson3.Task7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You have two classes:
 * <p>
 * Transaction: uuid: String,  state: State (CANCELED, FINISHED, PROCESSING), sum: Long, created: Date
 * Account: number: String, balance: Long, transactions: List<Transaction>
 * <p>
 * Both classes have getters for all fields with the corresponding names
 * (getState(), getSum(), getTransactions() and so on).
 * Write a method using Stream API that calculates the total sum of canceled transactions for all
 * non-empty accounts (balance > 0). Perhaps, flatMap method can help you to implement it.
 * Classes Transaction, Account and enum State will be available during testing.
 * You can define your own classes for local testing.
 * <p>
 * Important. Use the given template for your method. Pay attention to type of an
 * argument and the returned value. Please, use only Stream API, no cycles.
 * <p>
 * Examples: there are 2 accounts (in JSON notation) below. The result is 10 000.
 * <p>
 * [
 * {
 * "number": "1001",
 * "balance": 0,
 * "transactions": [
 * {
 * "uuid": "774cedda-9cde-4f53-8bc2-5b4d4859772a",
 * "state": "CANCELED",
 * "sum": 1000,
 * "created": "2016.12.12 18:30:05"
 * }
 * ]
 * },
 * {
 * "number": "1002",
 * "balance": 8000,
 * "transactions": [
 * {
 * "uuid": "337868a7-f469-43c0-9042-3422ce37ee26a",
 * "state": "FINISHED",
 * "sum": 8000,
 * "created": "2016.12.12 17:30:55"
 * },
 * {
 * "uuid": "f8047f86-89e7-4226-8b75-74c55a4d7e31",
 * "state": "CANCELED",
 * "sum": 10000,
 * "created": "2016.12.12 18:10:18"
 * }
 * ]
 * }
 * ]
 */
public class Task7 {
    static List<Account> accountList = new ArrayList<>();
    static List<Transaction> list1 = new ArrayList<>();
    static List<Transaction> list2 = new ArrayList<>();

    /**
     * Calculates the general sum of canceled transactions for all non empty accounts in the list
     */

    public static void main(String[] args) {
        initTransactionsList();
        initAccountsList();
        System.out.println(calcSumOfCanceledTransOnNonEmptyAccounts(accountList));
    }

    //Актуально ли сейчас работать с Date (согласно условия)? Почему не Calendar?
    public static void initTransactionsList() {
        Transaction transaction1for1 = new Transaction("774cedda-9cde-4f53-8bc2-5b4d4859772a",
                State.CANCELED, 1000L, new Date(2016, 12, 12, 18, 30, 05));
        Transaction transaction2for1 = new Transaction("774cedda-9cde-4f53-8bc2-5b4d4859772a",
                State.PROCESSING, 18000L, new Date(2016, 12, 12, 18, 30, 05));
        Transaction transaction1for2 = new Transaction("337868a7-f469-43c0-9042-3422ce37ee26a",
                State.FINISHED, 32000L, new Date(2016, 12, 12, 17, 30, 55));
        Transaction transaction2for2 = new Transaction("f8047f86-89e7-4226-8b75-74c55a4d7e31",
                State.CANCELED, 10000L, new Date(2016, 12, 12, 18, 10, 15));
        Transaction transaction3for2 = new Transaction("f8047f86-89e7-4226-8b75-74c55a4d7e31",
                State.CANCELED, 12000L, new Date(2016, 12, 12, 18, 10, 15));

        list1.add(transaction1for1);
        list1.add(transaction2for1);
        list2.add(transaction1for2);
        list2.add(transaction2for2);
        list2.add(transaction3for2);
    }

    public static void initAccountsList() {
        Account account1 = new Account("1001", 0L, list1);
        Account account2 = new Account("1002", 8000L, list2);

        accountList.add(account1);
        accountList.add(account2);
    }

    public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
        long calcSum = accounts.stream()
                .filter(account -> account.balance > 0)
                .flatMap(account -> account.getTransactions().stream()
                        .filter(transaction -> transaction.state == State.CANCELED)).mapToLong(p -> p.sum).sum();

        return calcSum;
    }
}

