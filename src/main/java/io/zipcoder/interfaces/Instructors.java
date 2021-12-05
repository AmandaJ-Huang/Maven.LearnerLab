package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        add(new Instructor(1L, "Leon"));
        add(new Instructor(2L, "Dolio"));
        add(new Instructor(3L, "Kris"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return this.personList.toArray(new Instructor[0]);
    }
}
