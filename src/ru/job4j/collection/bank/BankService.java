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
        if (user.isPresent()) {
            List<Account> list = users.get(user.get());
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return this.users
                    .get(user.get()).stream()
                    .filter(x -> x.getRequisite().equals(requisite))
                    .findFirst();
        }
            return Optional.empty();
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
