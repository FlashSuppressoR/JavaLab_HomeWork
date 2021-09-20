package Lesson3.Task7;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Date;

import static Lesson3.Task7.Task7.*;


public class Task7Test {

    @Test
    public void calcSumOfCanceledTransOnNonEmptyAccountsTest() {
        Account account1 = new Account("1001", 0L, list1);
        Account account2 = new Account("1002", 8000L, list2);
        accountList.add(account1);
        accountList.add(account2);

        Transaction transaction1for1 = new Transaction("774cedda-9cde-4f53-8bc2-5b4d4859772a",
                State.CANCELED, 1000L, new Date(2016, 12, 12, 18, 30, 05));
        Transaction transaction2for1 = new Transaction("774cedda-9cde-4f53-8bc2-5b4d4859772a",
                State.PROCESSING, 18000L, new Date(2016, 12, 12, 18, 30, 05));
        Transaction transaction1for2 = new Transaction("337868a7-f469-43c0-9042-3422ce37ee26a",
                State.FINISHED, 32000L, new Date(2016, 12, 12, 17, 30, 55));
        Transaction transaction2for2 = new Transaction("f8047f86-89e7-4226-8b75-74c55a4d7e31",
                State.CANCELED, 9000L, new Date(2016, 12, 12, 18, 10, 15));
        list1.add(transaction1for1);
        list1.add(transaction2for1);
        list2.add(transaction1for2);
        list2.add(transaction2for2);

        long produceSumResult = calcSumOfCanceledTransOnNonEmptyAccounts(accountList);
        long actualSumResult = 9000;

        Assertions.assertEquals(produceSumResult, actualSumResult);
    }
}