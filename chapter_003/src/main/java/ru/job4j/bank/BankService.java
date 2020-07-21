package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassportStream(String passport) {
        users.keySet().stream().filter(user -> user.getPassport().contains(passport)).equals(passport);
        return null;
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

    public Account findByRequisiteByStream(String passport, String requisite) {
        User user = findByPassportStream(passport);
        users.get(user).stream().filter(account -> account.getRequisite().contains(requisite)).equals(requisite);
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account rsl = null;
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account value : accounts) {
                if (value.getRequisite().equals(requisite)) {
                    rsl = value;
                    break;
                }
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
            if (destAccount != null) {
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                destAccount.setBalance((destAccount.getBalance() + amount));
            }
        }
        return rsl;
    }
}
