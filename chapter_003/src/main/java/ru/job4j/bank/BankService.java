package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
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

    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        for (User value : users.keySet()) {
            if (value.getPassport().equals(passport)) {
                rsl = Optional.of(value);
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

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> rsl = Optional.empty();
        if (user.isPresent()) {
            List<Account> accounts = users.get(user);
            for (Account value : accounts) {
                if (value.getRequisite().equals(requisite)) {
                    rsl = Optional.of(value);
                    break;
                }
            }
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (!srcAccount.isPresent() || srcAccount.get().getBalance() < amount) {
        rsl = false;
        } else {
            Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
            if (destAccount.isPresent()) {
                srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
                destAccount.get().setBalance((destAccount.get().getBalance() + amount));
                rsl = true;
            }
        }
        return rsl;
    }
}
