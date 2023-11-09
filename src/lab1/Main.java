package lab1;

public class Main{
    public static void main(String[]args){
        Course course1 = new AdvancedJavaCourse("Advanced Java", "123");
        Course course2 = new IntroJavaCourse("Intro to Java", "105");
        Course course3 = new IntroToProgrammingCourse("Intro to Programming", "101");

        course1.displayCourseInformation();
        course2.displayCourseInformation();
        course3.displayCourseInformation();

}
}
