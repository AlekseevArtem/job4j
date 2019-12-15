package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
//        Рабочий код через условный оператор if
//        int result;
//        if (first > second & first > third) result = first;
//        else if (second > third) result = second;
//        else result = third;
//        return result;

        int biggestof1and2 = first > second ? first : second;
        return biggestof1and2 > third ? biggestof1and2 : third;
    }
}