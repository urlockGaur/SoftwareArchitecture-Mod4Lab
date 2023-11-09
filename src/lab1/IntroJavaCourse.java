package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends Course {
    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }



    @Override
    public void displayCourseInformation() {
        System.out.println("Course: ");
        System.out.println( "Name: " + getCourseName() + " " + "Course Number:" + getCourseNumber() + " " + "Credits:" + getCredits());
    }


}
