package ru.job4j.streamapi;

import ru.job4j.lambda.Attachment;

import java.util.Objects;

public class Student {
    private int score;

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "{" + "score='" + score + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student stud = (Student) o;
        return Objects.equals(score, stud.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }
}
