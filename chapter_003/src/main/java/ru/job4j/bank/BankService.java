package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User value : users.keySet()) {
            if (value.getPassport().equals(passport)) {
                rsl = value;
                break;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        Account rsl = null;
        for (Account value : accounts) {
            if (value.getRequisite().equals(requisite)) {
                rsl = value;
                break;
            }
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount == null || srcAccount.getBalance() < amount) {
        rsl = false;
        } else {
            Account destAccount = findByRequisite(destPassport, destRequisite);
            double value = srcAccount.getBalance() - amount;
            srcAccount.setBalance(value);
            destAccount.setBalance((destAccount.getBalance() + amount));
        }
        return rsl;
    }
}
