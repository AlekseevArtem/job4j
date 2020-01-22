package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student first = new Student();
        first.setFullName("Петров Павел Николаевич");
        first.setGroup("ТХ-20");
        first.setAdmission(new Date());

        System.out.println("ФИО: " + first.getFullName() + ", Группа: " + first.getGroup() + ", Дата поступления: " + first.getAdmission());
    }
}
