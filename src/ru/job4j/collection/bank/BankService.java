package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    private List<Account> accounts = new ArrayList<>();

    public void addUser(User user) {
        users.put(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> value = users.get(user);
        value.add(account);
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User n : users.keySet()) {
            if (n.getPassport().equals(passport)) {
                user = n;
                break;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        for (Account n : users.get(user)) {
            if (n.getRequisite().equals(requisite)) {
                account = n;
                break;
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        User user = findByPassport(srcPassport);
        Account b = findByRequisite(srcPassport, srcRequisite);
        for (Account account : users.get(user)) {
            if ((account.getRequisite() != srcRequisite) || (account.getBalance() != b.getBalance())) {
                rsl = false;
            } else {
                Account c = findByRequisite(destPassport, destRequisite);
                amount = b.getBalance() + c.getBalance();
                rsl = true;
            }
        }
        return rsl;
    }
}
