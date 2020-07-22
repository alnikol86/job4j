package ru.job4j.bank;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("4652", "Alexander Nikolaev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("4652"), is(user));
    }
    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("4652", "Alexander Nikolaev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("4455", 150D));
        assertNull(bank.findByRequisite("34", "4455"));
    }
//    @Test
//    public void addAccount() {
//        User user = new User("4652", "Alexander Nikolaev");
//        BankService bank = new BankService();
//        bank.addUser(user);
//        bank.addAccount(user.getPassport(), new Account("4646", 150D));
//        assertThat(bank.findByRequisite("4652", "4646").getBalance(), is(150D));
//    }
//    @Test
//    public void transferMoney() {
//        User user = new User("4652", "Alexander Nikolaev");
//        BankService bank = new BankService();
//        bank.addUser(user);
//        bank.addAccount(user.getPassport(), new Account("4646", 150D));
//        bank.addAccount(user.getPassport(), new Account("456", 50D));
//        bank.transferMoney(user.getPassport(), "4646", user.getPassport(), "456", 150D);
//        assertThat(bank.findByRequisite(user.getPassport(), "456").getBalance(), is(200D));
//    }
    @Test
    public void addUser1() {
        User user = new User("5555", "Alexander Nikolaev");
        User user1 = new User("4444", "Alexander Nikolaev");
        User user2 = new User("4652", "Alexander Nikolaev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addUser(user1);
        bank.addUser(user2);
        assertThat(bank.findByPassportStream("4444"), is(user1));
    }
}
