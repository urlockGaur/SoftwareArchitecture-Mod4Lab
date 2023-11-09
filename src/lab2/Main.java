package lab2;

public class Main {
    public static void main(String[] args) {
        Course course1 = new AdvancedJavaCourse("Advanced Java", "Intro to Java");
        Course course2 = new IntroJavaCourse("Intro to Java", "Intro to Programming");
        Course course3 = new IntroToProgrammingCourse("Intro to Programming");

        String advancedJavaCourseInfo = course1.toString();
        String introJavaCourseInfo = course2.toString();
        String introToProgrammingCourseInfo = course3.toString();

        System.out.println(advancedJavaCourseInfo);
        System.out.println(introJavaCourseInfo);
        System.out.println(introToProgrammingCourseInfo);

    }
}
