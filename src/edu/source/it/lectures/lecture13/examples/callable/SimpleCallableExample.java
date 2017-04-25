package edu.source.it.lectures.lecture13.examples.callable;

import edu.source.it.lectures.lecture12.examples.transations.Account;
import edu.source.it.lectures.lecture12.examples.transations.Application;
import edu.source.it.lectures.lecture12.examples.transations.Transaction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SimpleCallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Account> accounts = Application.createAccounts(10);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Transaction>> futures = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            Future<Transaction> future = executorService.submit(new TransactionCallable(accounts));
            futures.add(future);
        }

        boolean complete = false;

        while (!complete) {
            complete = true;
            Iterator<Future<Transaction>> iter = futures.iterator();
            for (; iter.hasNext(); ) {
                Future<Transaction> future = iter.next();
                if (future.isDone()) {
                    Transaction transaction = future.get();
                    System.out.println(transaction);
                    iter.remove();
                } else {
                    complete = false;
                }
            }
        }

        executorService.shutdown();
    }
}