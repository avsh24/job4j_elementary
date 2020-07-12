package ru.job4j.collection.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();
    private List<Account> accounts = new ArrayList<>();

    public void addUser(User user) {
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (!user.isPresent()) {
            System.out.println("User not found");
        } else {
            accounts.add(account);
        }
//        User user = findByPassport(passport);
//        if (user != null) {
//            if (!users.get(user).contains(account)) {
//                users.get(user).add(account);
//            }
//        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = Optional.of(user);
                break;
            }
        }
        return rsl;
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport));
//                .findFirst().orElse(null);
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> accountToFind = Optional.empty();
        if (user.isPresent()) {
            List<Account> accountList = users.get(user.get());
            for (Account account : accountList) {
                if (account.getRequisite().equals(requisite)) {
                    return Optional.of(account);
                }
            }
//        if (user != null) {
//            for (Account account : users.get(user)) {
//                if (account.getRequisite().equals(requisite)) {
//                    return account;
//                }
//            }
            return this.users.get(user).stream().filter(x -> x.getRequisite());
//                    .equals(requisite)).findFirst().orElse(null);
//        }
        }
        return accountToFind;
//        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> accountFromTransfer = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accountToTransfer = findByRequisite(destPassport, destRequisite);
        if (accountFromTransfer.isPresent() && accountToTransfer.isPresent()
                && accountFromTransfer.get().getBalance() >= amount) {
            accountFromTransfer.get().setBalance(accountFromTransfer.get().getBalance() - amount);
            accountToTransfer.get().setBalance(accountToTransfer.get().getBalance() + amount);
            rsl = true;
        }
//        Account srsAccount = findByRequisite(srcPassport, srcRequisite);
//        Account destAccount = findByRequisite(destPassport, destRequisite);
//            if (srsAccount != null && destAccount != null && (srsAccount.getBalance() >= amount)) {
//                destAccount.setBalance(destAccount.getBalance() + amount);
//                srsAccount.setBalance(srsAccount.getBalance() - amount);
//                rsl = true;
//            }
        return rsl;
    }

    public static void main(String[] args) {
        BankService bank = new BankService();
        bank.addUser(new User("321", "Petr Arsentev"));
        Optional<User> opt = bank.findByPassport("3211");
        if (opt.isPresent()) {
            System.out.println(opt.get().getUsername());
        }
    }
}
