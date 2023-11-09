package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Course {

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }


    @Override
    public void displayCourseInformation() {
        System.out.println("Course: ");
        System.out.println( "Name: " + getCourseName() + " " + "Course Number:" + getCourseNumber() + " " + "Credits:" + getCredits());
    }
}


