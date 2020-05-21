package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый аккаунт пользователю. Перед этим проверяет что такого аккаунта еще нет у пользователя.
     * @param passport Номер асспорта.
     * @param account Аккаунт.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта.
     * @param passport Номер асспорта.
     * @return подошедщий пользователь или null (если не нашел).
     */
    public User findByPassport(String passport) {
        return users.keySet().stream().filter(user -> user.getPassport().equals(passport)).findFirst().orElse(null);
    }

    /**
     * Метод ищет Аккаунт пользовотеля по номеру паспорта (passport) и номеру счета (requisite).
     * @return подошедщий аккаунт или null (если не нашел).
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        return users.get(user).stream().filter(acc -> acc.getRequisite().equals(requisite)).findFirst().orElse(null);
    }

    /**
     * Метод переводит деньги от аккаунта одного пользовотеля к другому.
     * @param srcPassport srcRequisite - данные пользователя который совершает перевод
     * @param destPassport destRequisite - данные пользователя которому совершают перевод
     * @param amount Сумма перевода.
     * @return результат операции. Проверка что оба аккаунт существуют и на первом достаточно денег для перевода.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null) {
            return false;
        }
        boolean rsl = amount <= srcAccount.getBalance();
        if (rsl) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
        }
        return rsl;
    }
}