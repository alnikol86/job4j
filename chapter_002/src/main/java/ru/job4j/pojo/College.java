package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alexander Nikolaev");
        student.setGroup("777");
        student.setAdmission(new Date());
        System.out.println(student.getName() + " was accepted as student "
                + student.getAdmission() + " to the group " + student.getGroup());
    }
}
