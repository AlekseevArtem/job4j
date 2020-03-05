package ru.job4j.lambda;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SearchAttTest {
    @Test
    public void filterSizeTest() {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 101),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        List<Attachment> expect = Arrays.asList(
                new Attachment("image 1", 101)
        );
        List<Attachment> result = SearchAtt.filterSize(attachments);
        assertThat(result, is(expect));
    }

    @Test
    public void filterNameTest() {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 101),
                new Attachment("image 2 bug", 34),
                new Attachment("image 3", 13)
        );
        List<Attachment> expect = Arrays.asList(
                new Attachment("image 2 bug", 34)
        );
        List<Attachment> result = SearchAtt.filterName(attachments);
        assertThat(result, is(expect));
    }
}
