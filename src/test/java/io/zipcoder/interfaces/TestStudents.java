package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestStudents {

    @Test
    public void testStudentsSingleton() {
        // Given
        Students students = Students.getInstance();
        Integer expected = 10;

        // When
        Integer actual = students.count();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStudentsToArray() {
        // Given
        Students students = Students.getInstance();
        String expected = "[Paul, David, Cay, John, Carnell, Jacob, Rogelio, Keerthana, Mike, Tra]";

        // When
        String actual = Arrays.asList(students.toArray()).toString();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
