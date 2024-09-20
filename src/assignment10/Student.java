package assignment10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float GPA;
    private String major;

    public Student(String Id, String fullname, Date dateOfBirth, float GPA, String major) {
        super(Id, fullname, dateOfBirth);
        this.GPA = GPA;
        this.major = major;
    }

    public Student() {
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayinfor() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + this.getId());
        System.out.println("Name: " + this.getFullname());
        System.out.println("GPA: " + this.getGPA());
        System.out.println("Major: " + this.getMajor());
        if (getDateOfBirth() != null) {
            System.out.println("Date of Birth: " + sdf.format(getDateOfBirth()));
        } else {
            System.out.println("Date of Birth: N/A");
        }
    }

    public void addStudent() {
        Scanner scan = new Scanner(System.in);
        System.out.println("---Nhap Thong Tin Sinh Vien ---");
        System.out.print("ID: ");
        String id = scan.nextLine();
        setId(id);

        System.out.print("Name: ");
        String fullname = scan.nextLine();
        setFullname(fullname);

        System.out.print("GPA: ");
        float gpa = scan.nextFloat();
        setGPA(gpa);
        scan.nextLine();

        System.out.print("(dd/MM/yyyy): ");
        String dateOfBirthString = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sdf.parse(dateOfBirthString);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong....");
        }

        System.out.print("Major: ");
        String major = scan.nextLine();
        setMajor(major);
        
    }
}
