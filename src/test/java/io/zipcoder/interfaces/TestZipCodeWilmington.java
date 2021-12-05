package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        // Given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Double expected = 10.0;
        Double lectureHours = 100.0;

        // When
        zipCodeWilmington.hostLecture(1L, lectureHours);
        Map<Learner, Double> map = zipCodeWilmington.getStudyMap();
        Double actual = map.get(students.findById(101L));

        // Then
        Assert.assertEquals(expected, actual);
    }
}
