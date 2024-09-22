package student2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    float GPA;
    String major;
    double tuition;
    boolean schoolarship;

    public Student() {
    }

    public Student(float GPA, String major, double tuition, boolean schoolarship, String id, String fullname, Date dateOfBirth) {
        super(id, fullname, dateOfBirth);
        this.GPA = GPA;
        this.major = major;
        this.tuition = calculateTuition();
        this.schoolarship = schoolarship;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
        this.schoolarship = GPA >= 9;
        this.tuition = calculateTuition();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public boolean isSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(boolean schoolarship) {
        this.schoolarship = schoolarship;
    }

    public void addStudent() {
        Scanner scan = new Scanner(System.in);
        System.out.println("---Nhap thong tin sinh vien---");
        System.out.print("ID: ");
        String id = scan.nextLine();
        setId(id);

        System.out.print("NAME: ");
        String name = scan.nextLine();
        setFullname(fullname);

        System.out.print("dd/MM/yyyy");
        String dateOfBirthString = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sdf.parse(dateOfBirthString);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong....");
        }

        System.out.println("Major: ");
        String major = scan.nextLine();
        setMajor(major);
    }

    @Override
    public void displayInfor() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + this.getId());
        System.out.println("Name: " + this.getFullname());
        if (getDateOfBirth() != null) {
            System.out.println("Date of Birth: " + sdf.format(getDateOfBirth()));
        } else {
            System.out.println("Date of Birth: N/A");
        }
        System.out.println("GPA: " + this.getGPA());
        System.out.println("Major: " + this.getMajor());
        System.out.println("Tuiition: " + this.getTuition());
        System.out.println("schoolarship: " + this.isSchoolarship());
    }

    public double calculateTuition() {
        final double TUITION = 10000000; 
        final double SCHOLARSHIP_DISCOUNT = 0.5; 

        if (GPA >= 9) {
            return TUITION * SCHOLARSHIP_DISCOUNT;
        } else {
            return TUITION;
        }
    }
}
