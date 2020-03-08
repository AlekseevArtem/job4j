package ru.job4j.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student implements Comparable<Student> {
    private String surname;
    private String group;
    private int score;

    public Student(int score) {
        this.score = score;
    }

    public Student(String surname, String group, int score) {
        this.surname = surname;
        this.group = group;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    static Map<String, Student> collect(List<Student> students) {
        return students.stream().distinct().collect(Collectors.toMap(Student::getSurname, e -> e));
    }

    static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().sorted(Comparator.naturalOrder()).distinct().flatMap(Stream::ofNullable).takeWhile(v -> v.getScore() < bound).collect(Collectors.toList());
    }

    @Override
    public int compareTo(Student another) {
        return Integer.compare(score, another.score);
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
        return Objects.equals(score, stud.score)
                && Objects.equals(group, stud.group)
                && Objects.equals(surname, stud.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }
}
