package Lesson3.Task7;

import java.util.List;

class Account {
    String id;
    Long balance;
    List<Transaction> transactions;

    public Account(String id, Long balance, List<Transaction> transactions) {
        this.id = id;
        this.balance = balance;
        this.transactions = transactions;
    }

    public String getId() {
        return id;
    }

    public Long getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
