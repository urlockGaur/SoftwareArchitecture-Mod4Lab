package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends Course {

    String prerequisites;
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    @Override
    public void displayCourseInformation() {
        System.out.println("Course: ");
        System.out.println( "Name: " + getCourseName() + " " + "Course Number:" + getCourseNumber() + " " + "Credits:" + getCredits() + " " + "Prereq: " + getPrerequisites());
    }
}
