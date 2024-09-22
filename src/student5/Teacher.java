
package student5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    String department;
    String teachingSubject;

    public Teacher(String department, String teachingSubject, String id, String fullname, Date dateOfBirth, Date bookBorrowdate, Date bookReturnDate) {
        super(id, fullname, dateOfBirth, bookBorrowdate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }
    public Teacher() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy: ");
        System.out.println("ID: " + this.getId());
        System.out.println("Name: " + this.getFullname());
        if (getDateOfBirth() != null) {
            System.out.println("Date of Birth: " + sdf.format(getDateOfBirth()));
        } else {
            System.out.println("Date of Birth: N/A");
        }
        System.out.println("department: " + this.getDepartment());
        System.out.println("teachingSubject: " + this.getTeachingSubject());

    }

    public void updatePerson() {
        Scanner scan = new Scanner(System.in);
        if (scan != null) {
            System.out.println("---Nhap thong tin Giao vien---");
            System.out.print("nhap id: ");
            String id = scan.nextLine();
            setId(id);

            System.out.print("nhap Name: ");
            String fullname = scan.nextLine();
            setFullname(fullname);

            System.out.print("date dd/MM/yyyy: ");
            String dateOfBirthString = scan.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date dateOfBirth = sdf.parse(dateOfBirthString);
                setDateOfBirth(dateOfBirth);
            } catch (Exception e) {
                System.out.println("wrong.......");
            }

            System.out.println("nhap department: ");
            String department = scan.nextLine();
            setDepartment(department);

            System.out.println("nhap teachingSubject: ");
            String teachingSubject = scan.nextLine();
            setTeachingSubject(teachingSubject);
        }
    }

    @Override
    public void addPerson() {
        Scanner scan = new Scanner(System.in);
        System.out.println("---Nhap thong tin Giao vien---");
        System.out.print("nhap id: ");
        String id = scan.nextLine();
        setId(id);

        System.out.print("nhap Name: ");
        String fullname = scan.nextLine();
        setFullname(fullname);

        System.out.print("date dd/MM/yyyy: ");
        String dateOfBirthString = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sdf.parse(dateOfBirthString);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("wrong.......");
        }

        System.out.print("nhap department: ");
        String department = scan.nextLine();
        setDepartment(department);

        System.out.print("nhap teachingSubject: ");
        String teachingSubject = scan.nextLine();
        setTeachingSubject(teachingSubject);
    }
}
