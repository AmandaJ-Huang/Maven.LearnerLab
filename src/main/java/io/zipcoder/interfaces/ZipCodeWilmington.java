package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher = Educator.valueOf(teacher.toString());
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        instructors.findById(id).lecture(students.toArray(), numberOfHours);
    }

    public Map<Learner, Double> getStudyMap() {
        Learner[] learners = students.toArray();
        Map<Learner, Double> studyMap = new HashMap<>();

        for (Learner l : learners) {
            studyMap.put(l, l.getTotalStudyTime());
        }

        return studyMap;
    }
}
