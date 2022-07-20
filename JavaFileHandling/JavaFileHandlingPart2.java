package JavaFileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFileHandlingPart2 {




    public static void printOptions(){

        System.out.println("Press 1 define course  ");
        System.out.println("Press 2 register new student ");
        System.out.println("Press 3 to view all courses ");
        System.out.println("Press 4 to view all student  ");
        System.out.println("Press 5 to enroll student  ");
        System.out.println("Press 6 to view all student in the course ");

    }
    public static void inputCourseDetails() {

            Course course = new Course();
            course.setCourseName(JavaFileHandlingPart2.getInput("Enter Course Name: "));
            course.setTeacherName(JavaFileHandlingPart2.getInput("Enter Teacher Name: "));
            course.setSubject(JavaFileHandlingPart2.getInput("Enter Subject Name: "));

            try {
                FileWriter fileWriter = new FileWriter("Course1.txt");
//            FileHandleUms.inputCourseDetails();
                fileWriter.write(course.getCourseName() + "\n");
                fileWriter.write(course.getTeacherName() + "\n");
                fileWriter.write(course.getSubject() + "\n");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();

            }

        }

        private static String getInput(String message){

        Scanner sc = new Scanner(System.in);
        System.out.print(message);

         return sc.nextLine();


    }


    public static void message(String msg1,String msg2,String msg3) {
        System.out.println("The name of the course is : " + msg1);
        System.out.println("The name of the teacher is : "+ msg2);
        System.out.println("The name of the subject is : "+ msg3);

    }
    public static void viewCourse() {
        File myFile = new File("Course1.txt");
        Scanner sc = null;
        String line = null;

        try {
            sc = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
            while(sc.hasNextLine()){
                JavaFileHandlingPart2.message(sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
            sc.close();
        }

     // Register student section start from here
    public static void inputRegisterStudent() {
        Student student = new Student();
        student.setRollNo(JavaFileHandlingPart2.getInput("Enter roll no: "));
        student.setName(JavaFileHandlingPart2.getInput("Enter name: "));
        student.setDob(JavaFileHandlingPart2.getInput("Enter date of birth: "));
        student.setAge(JavaFileHandlingPart2.getInput("Enter age : "));

        try {
            FileWriter fileWriter = new FileWriter("Student1.txt");
//            FileHandleUms.inputCourseDetails();
            fileWriter.write(student.getRollNo() + "\n");
            fileWriter.write(student.getName() + "\n");
            fileWriter.write(student.getDob() + "\n");
            fileWriter.write(student.getAge() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    private static String getStudentInput(String message){

        Scanner sc = new Scanner(System.in);
        System.out.print(message);

        return sc.nextLine();
    }
    public static void message1(String msg1,String msg2,String msg3,String msg4) {
        System.out.println("Roll no is : " + msg1);
        System.out.println("Name of student is  : "+ msg2);
        System.out.println("Date of birth  is : "+ msg3);
        System.out.println("Age : "+ msg4);

    }
    public static void viewAllStudent() {
        File myFile = new File("Student1.txt");
        Scanner sc = null;
        String line = null;

        try {
            sc = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(sc.hasNextLine()){
            JavaFileHandlingPart2.message1(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
        }
        sc.close();
    }

    // Enrollement section starts from here
    public static void inputEnrolledStudent() {

        Enrollement enroll = new Enrollement();
        enroll.setEnrollmentNo(JavaFileHandlingPart2.getInput("Enter enroll no: "));
        enroll.setStudent(JavaFileHandlingPart2.getInput("Enter name: "));
        enroll.setCourse(JavaFileHandlingPart2.getInput("Enter course name: "));

        try {
            FileWriter fileWriter = new FileWriter("Student1.txt");
//            FileHandleUms.inputCourseDetails();
            fileWriter.write(enroll.getEnrollmentNo() + "\n");
            fileWriter.write(enroll.getStudent() + "\n");
            fileWriter.write(enroll.getCourse() + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    private static String getEnrolledInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }


    }


