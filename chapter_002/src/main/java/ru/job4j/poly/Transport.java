package ru.job4j.poly;

public interface Transport {

    void drive();

    void passengers(int numberOfPassengers);

    int refuelCost(int amountOfFuel);

}
