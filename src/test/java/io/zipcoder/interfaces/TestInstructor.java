package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        // Given
        Instructor instructor = new Instructor();
        Student student = new Student();
        Double expected = 40.0;

        // When
        instructor.teach(student, expected);
        Double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        // Given
        Instructor instructor = new Instructor();
        Student[] students = new Student[2];
        Double lectureHours = 90.0;
        Double expected = 45.0;

        // When
        students[0] = new Student();
        students[1] = new Student();
        instructor.lecture(students, lectureHours);
        Double actualStudent0 = students[0].getTotalStudyTime();
        Double actualStudent1 = students[1].getTotalStudyTime();

        // Then
        Assert.assertEquals(expected, actualStudent0);
        Assert.assertEquals(expected, actualStudent1);
    }
}
