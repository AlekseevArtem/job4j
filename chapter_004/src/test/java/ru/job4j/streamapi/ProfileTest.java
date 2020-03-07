package ru.job4j.streamapi;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class ProfileTest {
    @Test
    public void profileTests() {
    List<Profile> raw = Arrays.asList(
            new Profile(new Address("New York", "Pushkina", 1, 2)),
            new Profile(new Address("London", "Baker St", 11, 221))
    );
    List<Address> result = Profile.collect(raw);
    List<Address> expect = Arrays.asList(
            new Address("New York", "Pushkina", 1, 2),
            new Address("London", "Baker St", 11, 221)
    );
    Assert.assertThat(result, is(expect));
    }
}
