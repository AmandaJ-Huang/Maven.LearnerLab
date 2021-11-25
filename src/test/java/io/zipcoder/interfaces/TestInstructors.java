package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

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
}
