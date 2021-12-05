package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestInstructors {

    @Test
    public void testInstructorsSingleton() {
        // Given
        Instructors instructors = Instructors.getInstance();
        Integer expected = 3;

        // When
        Integer actual = instructors.count();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstructorsPrintOut() {
        // Given
        Instructors instructors = Instructors.getInstance();
        String expected = "[Leon, Dolio, Kris]";

        // When
        String actual = Arrays.asList(instructors.toArray()).toString();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
