package  Thithuchanhjava2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    @author:  TA VAN MINH
    Date   : 5/21/2022
    Project: Java2
*/
public class Managerment {
    private List<Student> studentList;
    private static Scanner input = new Scanner(System.in);

    public Managerment() {
        this.studentList = new ArrayList<>();
    }

    public void objAddStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent() {
        int studentID;
        String name, address, phone;

        System.out.println("You choosed adding student record!");
        System.out.println("Please enter student ID: ");
        studentID = input.nextInt();

        if (studentList.stream().allMatch(student -> student.getStudentID() != (studentID))) {
            System.out.println("Enter student name");
            input.nextLine();
            name = input.nextLine();
            System.out.println("Enter address");
            address = input.nextLine();
            System.out.println("Enter phone number");
            phone = input.nextLine();
            Student stu = new Student(studentID, name, address, phone);
            studentList.add(stu);
            System.out.println("Successfully added 1 student!");
        } else {
            System.out.println("Duplicate student ID, add failed!");
        }
    }
}
