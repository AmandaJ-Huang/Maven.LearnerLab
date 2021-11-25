package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

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
}
