package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private double totalStudyTime;

    public Student() {
        super(0, "");
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
