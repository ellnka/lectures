package edu.source.it.lectures.lecture13.examples.callable;

import edu.source.it.lectures.lecture12.examples.transations.Account;
import edu.source.it.lectures.lecture12.examples.transations.Transaction;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class TransactionCallable implements Callable<Transaction> {
    private static final Random random = new Random();
    private final List<Account> accounts;

    public TransactionCallable(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public Transaction call() throws InterruptedException {
        Thread.sleep(300);
        int fromIndex = random.nextInt(accounts.size());
        int toIndex = random.nextInt(accounts.size());
        Account from = accounts.get(fromIndex);
        Account to = accounts.get(toIndex);
        long amount = random.nextInt(10_000);
        return new Transaction(from, to, amount);
    }
}
