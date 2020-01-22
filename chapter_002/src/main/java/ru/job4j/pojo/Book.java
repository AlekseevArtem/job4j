package ru.job4j.pojo;

public class Book {
    private String title;
    private int numberOfPage;

    public Book(String title, int numberOfPage) {
        this.title = title;
        this.numberOfPage = numberOfPage;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
