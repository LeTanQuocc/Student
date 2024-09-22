package student4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    float GPA;
    String major;

    public Student() {
    }

    public Student(float GPA, String major, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.GPA = GPA;
        this.major = major;
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

    public void addPerson() {
        Scanner scan = new Scanner(System.in);
        System.out.println("---Nhap thong tin sinh vien---");
        System.out.print("ID: ");
        String id = scan.nextLine();
        setId(id);

        System.out.print("NAME: ");
        String name = scan.nextLine();
        setFullName(fullName);

        System.out.print("dd/MM/yyyy: ");
        String dateOfBirthString = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sdf.parse(dateOfBirthString);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong....");
        }

        System.out.print("GPA: ");
        float GPA = scan.nextFloat();
        setGPA(GPA);
        scan.nextLine();

        System.out.println("Major: ");
        String major = scan.nextLine();
        setMajor(major);
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + this.getId());
        System.out.println("Name: " + this.getFullName());
        if (getDateOfBirth() != null) {
            System.out.println("Date of Birth: " + sdf.format(getDateOfBirth()));
        } else {
            System.out.println("Date of Birth: N/A");
        }
        System.out.println("GPA: " + this.getGPA());
        System.out.println("Major: " + this.getMajor());
    }

    public void updatePerson(String id) {
        Scanner scan = new Scanner(System.in);
        if(scan !=null){
        System.out.println("---Nhap thong tin---");
        System.out.print("ID: ");
        String newid = scan.nextLine();
        setId(newid);

        System.out.print("NAME: ");
        String name = scan.nextLine();
        setFullName(fullName);

        System.out.print("dd/MM/yyyy");
        String dateOfBirthString = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sdf.parse(dateOfBirthString);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong....");
        }
        

        System.out.print("GPA: ");
        float GPA = scan.nextFloat();
        setGPA(GPA);

        System.out.println("Major: ");
        String major = scan.nextLine();
        setMajor(major);
        }

    }
}
