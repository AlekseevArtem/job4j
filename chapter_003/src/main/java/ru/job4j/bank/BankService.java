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

    /**
     * Метод добавляет новый аккаунт пользователю. Перед этим проверяет что такого аккаунта еще нет у пользователя.
     * @param passport Номер асспорта.
     * @param account Аккаунт.
     */
    public void addAccount(String passport, Account account) {
        List<Account> accounts = users.get(findByPassport(passport));
        boolean checkForExist = true;
        for (Account acc : accounts) {
            if (account.equals(acc)) {
                checkForExist = false;
                break;
            }
        }
        if (checkForExist) {
            accounts.add(account);
            users.put(findByPassport(passport), accounts);
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта.
     * @param passport Номер асспорта.
     * @return подошедщий пользователь или null (если не нашел).
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет Аккаунт пользовотеля по номеру паспорта (passport) и номеру счета (requisite).
     * @return подошедщий аккаунт или null (если не нашел).
     */
    public Account findByRequisite(String passport, String requisite) {
        List<Account> accounts = users.get(findByPassport(passport));
        for (Account acc : accounts) {
            if (requisite.equals(acc.getRequisite())) {
                return acc;
            }
        }
        return null;
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
        boolean rsl = srcAccount != null && destAccount != null && amount <= srcAccount.getBalance();
        if (rsl) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
        }
        return rsl;
    }
}