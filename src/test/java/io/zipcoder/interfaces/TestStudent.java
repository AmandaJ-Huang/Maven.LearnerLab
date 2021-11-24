package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        Student student = new Student();
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student();
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        // Given
        Student student = new Student();
        Double expected = 100.0;

        // When
        student.learn(expected);
        Double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
