package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Martin Iden", 310);
        Book second = new Book("Clean code", 600);
        Book third = new Book("The Old Man and the Sea", 200);
        Book fourth = new Book("White Fang", 400);


        Book[] shelf = new Book[4];
        shelf[0] = first;
        shelf[1] = second;
        shelf[2] = third;
        shelf[3] = fourth;

        System.out.println("Book list:");
        for (int index = 0; index < shelf.length; index++) {
            Book pr = shelf[index];
            System.out.println(index + 1 + ". Title: " + pr.getTitle() + ", pages: " + pr.getNumberOfPage());
        }

        System.out.println("Replace first with fourth. Book list:");
        Book temp = shelf[0];
        shelf[0] = shelf[3];
        shelf[3] = temp;
        for (int index = 0; index < shelf.length; index++) {
            Book pr = shelf[index];
            System.out.println(index + 1 + ". Title: " + pr.getTitle() + ", pages: " + pr.getNumberOfPage());
        }

        final char dm = (char) 34;
        System.out.println("Find books with a title " + dm + "Clean code" + dm + ".");
        for (int index = 0; index < shelf.length; index++) {
            Book pr = shelf[index];
            if (pr.getTitle().equals("Clean code")) {
                System.out.println(index + 1 + ". Title: " + pr.getTitle() + ", pages: " + pr.getNumberOfPage());
            }
        }

    }
}
