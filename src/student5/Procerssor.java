
package student5;

import java.util.ArrayList;
import java.util.Scanner;

public class Procerssor {
    public static void main(String[] args) {
        PersonList personlist = new PersonList();
        Scanner scan = new Scanner(System.in);
        String check;
        do{
            System.out.println("------menu------");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find teachers by department");
            System.out.println("8. Notify whether the book's return due date has arrived or not");
            System.out.println("nhap lua chon");
            int luachon=scan.nextInt();
            scan.nextLine();
            switch (luachon) {
                case 1->{
                    personlist.addStudent(); 
                    break;
                }
                case 2->{
                    personlist.addTeacher();
                    break;
                }
                case 3->{
                    System.out.println("nhap id update:");
                    String id=scan.nextLine();
                    personlist.updatePerson(id);
                    break;
                }
                case 4->{
                    System.out.println("nhap id delete:");
                    String id=scan.nextLine();
                    personlist.deletePersonById(id);
                    break;
                }
                case 5->{
                    personlist.displayEveryone();
                    break;
                }
                
                case 6->{
                    Student top=personlist.findTopStudent();
                    top.displayInfo();
                    break;
                }
                case 7->{
                    System.out.println("nhap department:");
                    String de=scan.nextLine();
                    Teacher teacher=personlist.findTeacherByDepartment();
                }
                case 8->{
                    personlist.checkBookBorrowing();
                }
                default -> {
                    System.out.println("Lua chon sai. Moi nhap lai.");
                }
            }
        } while (true);
    }
}
