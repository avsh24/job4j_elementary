package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    private List<Account> accounts = new ArrayList<>();

    public void addUser(User user) {
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        if (findByPassport(passport) != null) {
            if (!users.get(findByPassport(passport)).contains(account)) {
                users.get(findByPassport(passport)).add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        if (findByPassport(passport) != null) {
            for (Account value : users.get(findByPassport(passport))) {
                if (value.getRequisite().equals(requisite)) {
                    return value;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account b = findByRequisite(srcPassport, srcRequisite);
            if ((b.getRequisite() != srcRequisite) || (b.getBalance() != b.getBalance())) {
                Account c = findByRequisite(destPassport, destRequisite);
                amount = b.getBalance() + c.getBalance();
                rsl = true;
            }
        return rsl;
    }
}
