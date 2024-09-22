
package student4;

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
            System.out.println("nhap lua chon");
            int luachon=scan.nextInt();
            scan.nextLine();
            switch (luachon) {
                case 1 -> {
                    personlist.addStudent();
                }
                case 2 -> {
                    personlist.addTeacher(); 
                }
                case 3 -> {
                    System.out.println("Nhap id cap nhat: ");
                    String id = scan.nextLine();
                    personlist.updatePerson(id);  
                }
                case 4 -> {
                    System.out.println("Nhap id can xoa:");
                    String id = scan.nextLine();
                    personlist.deletePersonById(id); 
                }
                case 5 -> {
                    personlist.displayEveryone(); 
                }
                case 6 -> {
                    Student topStudent = personlist.findTopStudent();
                    if (topStudent != null) {
                        topStudent.displayInfo(); 
                    } else {
                        System.out.println("Khong co sinh vien nao");
                    }
                }
                case 7 -> {
                    System.out.println("Nhap ten department: ");
                    String department = scan.nextLine();
                    personlist.findTeacherByDepartment(department); 
                }
                case 8 -> {
                    System.out.println("---End---");
                    return;
                }
                default -> {
                    System.out.println("Lua chon sai. Moi nhap lai.");
                }
            }
        } while (true);
    }
}
