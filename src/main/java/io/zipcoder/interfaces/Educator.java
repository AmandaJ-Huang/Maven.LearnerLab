package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    LEON(Instructors.getInstance().findById(1L)),
    DOLIO(Instructors.getInstance().findById(2L)),
    KRIS(Instructors.getInstance().findById(3L));

    private Instructor instructor;

    private Double timeWorked = 0.0;

    Educator(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
        setTimeWorked(numberOfHours);

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
        setTimeWorked(numberOfHours);
    }

    public void setTimeWorked(Double timeWorked) {
        this.timeWorked = timeWorked;
    }

    public Double getTimeWorked() {
        return this.timeWorked;
    }
}
