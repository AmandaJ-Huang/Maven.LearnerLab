package io.zipcoder.interfaces;

public class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {
        add(new Student(101L, "Paul"));
        add(new Student(102L, "David"));
        add(new Student(103L, "Cay"));
        add(new Student(104L, "John"));
        add(new Student(105L, "Carnell"));
        add(new Student(106L, "Jacob"));
        add(new Student(107L, "Rogelio"));
        add(new Student(108L, "Keerthana"));
        add(new Student(109L, "Mike"));
        add(new Student(110L, "Tra"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        return new Student[0];
    }

}
