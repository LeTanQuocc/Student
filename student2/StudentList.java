package student2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentList {

    ArrayList<Student> studentList = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);

    public void addstudent(Student student) {
        studentList.add(student);
    }

    public boolean updateStudentByID(String id) {
        Student student = findStudentById(id);
        if (student != null) {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("new name: ");
            String fullName = keyboard.nextLine();
            student.setFullname(fullName);

            System.out.print("new dateOfBirth (dd/MM/yyyy): ");
            String dateOfBirthStr = keyboard.nextLine();
            try {
                Date dateOfBirth = sdf.parse(dateOfBirthStr);
                student.setDateOfBirth(dateOfBirth);
            } catch (Exception e) {
                System.out.println("Error (dd/MM/yyyy).");
                return false;
            }

            System.out.print("Enter new GPA: ");
            float gpa = keyboard.nextFloat();
            student.setGPA(gpa);
            keyboard.nextLine();

            System.out.print("Enter new major: ");
            String major = keyboard.nextLine();
            student.setMajor(major);

            return true;
        } else {
            System.out.print("Not found id: " + id);
            return false;
        }
    }

    public void deleteStudentById(String id) {
        studentList.removeIf(student -> student.getId().equals(id));
    }

    public Student findStudentById(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudent() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("hoc sinh thu: " + i + 1);
            studentList.get(i).displayInfor();
        }
    }

    public Student findTopStudent() {
        Student top = studentList.get(0);
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getGPA() > top.getGPA()) {
                top = student;
            }
        }
        return top;
    }

    public ArrayList<Student> findScholarshipStudents() {

        ArrayList<Student> scholarshipStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.isSchoolarship()) {
                scholarshipStudents.add(student);
            }
        }
        return scholarshipStudents;

    }

    public double caculateTuiitionOfAllStudents() {
        double totalTuition = 0;
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            totalTuition += student.getTuition();
        }
        return totalTuition;

    }
}
