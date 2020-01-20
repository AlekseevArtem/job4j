package ru.job4j.oop.kolobok;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();

        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
        ball.eatenBy(fox);
    }

}

