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
        Learner[] learners = students.toArray();
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor instructor = instructors.findById(id);
        Learner[] learners = students.toArray();
        instructor.lecture(learners, numberOfHours);
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
