package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );

        attachments.sort(Comparator.comparingInt(Attachment::getSize));
        System.out.println(attachments);

        attachments.sort(Comparator.comparing(Attachment::getName));
        System.out.println(attachments);
    }
}