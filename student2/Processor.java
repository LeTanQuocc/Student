package student2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("------ Menu ------");
            System.out.println("1. Add new student");
            System.out.println("2. Update student by ID");
            System.out.println("3. Delete student by ID");
            System.out.println("4. Display all students");
            System.out.println("5. Find top student by GPA");
            System.out.println("6. Display students with scholarship");
            System.out.println("7. Calculate total tuition of all students");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int option;
            try {
                option = scanner.nextInt();
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
                continue;
            }

            switch (option) {
                case 1:
                    Student newStudent = new Student();
                    System.out.print("Enter ID: ");
                    newStudent.setId(scanner.nextLine());

                    System.out.print("Enter Name: ");
                    newStudent.setFullname(scanner.nextLine());

                    System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
                    try {
                        Date dateOfBirth = sdf.parse(scanner.nextLine());
                        newStudent.setDateOfBirth(dateOfBirth);
                    } catch (Exception e) {
                        System.out.println("Invalid date format. Please use dd/MM/yyyy.");
                        continue;
                    }

                    System.out.print("Enter GPA: ");
                    try {
                        newStudent.setGPA(scanner.nextFloat());
                        scanner.nextLine(); 
                    } catch (Exception e) {
                        System.out.println("Invalid GPA input. Please enter a number.");
                        scanner.nextLine(); 
                        continue;
                    }

                    System.out.print("Enter Major: ");
                    newStudent.setMajor(scanner.nextLine());
                    newStudent.setTuition(newStudent.calculateTuition()); 
                    studentList.addstudent(newStudent);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    String idToUpdate = scanner.nextLine();
                    if (studentList.updateStudentByID(idToUpdate)) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student with ID " + idToUpdate + " not found.");
                    }
                    break;

                case 3: 
                    System.out.print("Enter ID to delete: ");
                    String idToDelete = scanner.nextLine();
                    studentList.deleteStudentById(idToDelete);
                    System.out.println("Student deleted successfully.");
                    break;

                case 4: 
                    studentList.displayAllStudent();
                    break;

                case 5:
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Top student:");
                        topStudent.displayInfor();
                    } else {
                        System.out.println("No students found.");
                    }
                    break;

                case 6:
                    System.out.println("Students with scholarship:");
                    for (Student student : studentList.findScholarshipStudents()) {
                        student.displayInfor();
                        System.out.println();
                    }
                    break;

                case 7: 
                    double totalTuition = studentList.caculateTuiitionOfAllStudents();
                    System.out.println("Total tuition of all students: " + totalTuition);
                    break;

                case 8: 
                    System.out.println("Exiting program...");
                    scanner.close();
                    return; 

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
