package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void testImplementation() {
        // Given
        Educator educatorLeon = Educator.LEON;
        Educator educatorDolio = Educator.DOLIO;
        Educator educatorKris = Educator.KRIS;

        // Then
        Assert.assertTrue(educatorLeon instanceof Teacher);
        Assert.assertTrue(educatorDolio instanceof Teacher);
        Assert.assertTrue(educatorKris instanceof Teacher);
    }

    @Test
    public void testTeach() {
        // Given
        Educator educatorLeon = Educator.LEON;
        Student student = new Student();
        Double expected = 40.0;

        // When
        educatorLeon.teach(student, expected);
        Double actual = student.getTotalStudyTime();
        Double timeWorked = educatorLeon.getTimeWorked();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, timeWorked);
    }

    @Test
    public void testLecture() {
        // Given
        Educator educatorLeon = Educator.LEON;
        Student[] students = new Student[2];
        Double lectureHours = 90.0;
        Double expected = 45.0;

        // When
        students[0] = new Student();
        students[1] = new Student();
        educatorLeon.lecture(students, lectureHours);
        Double actualStud0 = students[0].getTotalStudyTime();
        Double actualStud1 = students[1].getTotalStudyTime();
        Double timeWorked = educatorLeon.getTimeWorked();

        // Then
        Assert.assertEquals(expected, actualStud0);
        Assert.assertEquals(expected, actualStud1);
        Assert.assertEquals(lectureHours, timeWorked);
    }
}
