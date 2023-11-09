package lab2;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse implements Course{
    private String courseName;
    public IntroToProgrammingCourse(String courseName) {
        setCourseName(courseName);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    @Override
    public String courseNumber() {
        return "101";
    }

    @Override
    public double getCredits() {
        return 1.5;
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    @Override
    public String toString() {
        return "Intro To Programming{" +
                "courseName='" + courseName + '\'' +
                ", courseNumber='" + courseNumber() + '\'' +
                ", credits=" + getCredits() + '\'' +
                '}';
    }
}
