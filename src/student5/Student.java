
package student5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.print.SimpleDoc;

public class Student extends Person{
    float GPA;
    String major;

    public Student(float GPA, String major, String id, String fullname, Date dateOfBirth, Date bookBorrowdate, Date bookReturnDate) {
        super(id, fullname, dateOfBirth, bookBorrowdate, bookReturnDate);
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
    public void addPerson() {
        Scanner scan = new Scanner(System.in);
        System.out.println("---nhap thong tin---");
        System.out.print("Nhap id: ");
        String id = scan.nextLine();
        setId(id);
        
        System.out.print("fullname: ");
        String fullname = scan.nextLine();
        setFullname(fullname);
        
        System.out.print("dd/MM/yyyy");
        String dateOfBirthString = scan.nextLine();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = date.parse(dateOfBirthString);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e){
            System.out.print("wrong....");
        }
         
        System.out.print("Nhap bookBorrowDate (dd/MM/yyyy): ");
        String bookBorrowDateString = scan.nextLine();
        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date bookBorrowDate = date1.parse(bookBorrowDateString);
            setBookBorrowdate(bookBorrowDate);
        } catch (Exception e){
            System.out.print("wrong....");
        }
        
        System.out.print("Nhap bookReturnDate(date/MM/yyyy): ");
        String bookReturnDateString = scan.nextLine();
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date bookReturnDate = date2.parse(bookReturnDateString);
            setBookReturnDate(bookReturnDate);
        } catch(Exception e){
            System.out.println("wrong....");
        }
        
        System.out.print("Nhap GPA: ");
        float GPA = scan.nextFloat();
        setGPA(GPA);
        scan.nextLine();
        
        System.out.print("Nhap major: ");
        String major = scan.nextLine();
        setMajor(major);
   }

    @Override
    public void updatePerson(String id) {
     Scanner scan = new Scanner(System.in);
     if(scan != null){
        System.out.print("---nhap thong tin---");
        System.out.println("Nhap id: ");
        String newid = scan.nextLine();
        setId(newid);
        
        System.out.print("fullname: ");
        String fullname = scan.nextLine();
        setFullname(fullname);
        
        System.out.print("dd/MM/yyyy");
        String dateOfBirthString = scan.nextLine();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = date.parse(dateOfBirthString);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e){
            System.out.print("wrong....");
        }
         
        System.out.print("Nhap bookBorrowDate (dd/MM/yyyy): ");
        String bookBorrowDateString = scan.nextLine();
        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date bookBorrowDate = date1.parse(bookBorrowDateString);
            setBookBorrowdate(bookBorrowDate);
        } catch (Exception e){
            System.out.print("wrong....");
        }
        
        System.out.print("Nhap bookReturnDate(date/MM/yyyy): ");
        String bookReturnDateString = scan.nextLine();
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date bookReturnDate = date2.parse(bookReturnDateString);
            setBookReturnDate(bookReturnDate);
        } catch(Exception e){
            System.out.println("wrong....");
        }
        
        System.out.print("Nhap GPA: ");
        float GPA = scan.nextFloat();
        setGPA(GPA);
        scan.nextLine();
        
        System.out.print("Nhap major: ");
        String major = scan.nextLine();
        setMajor(major);
     }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("ID: "+this.getId());
        System.out.println("FullName: "+this.getFullname());
        System.out.println("dd/MM/yyyy: "+date.format(dateOfBirth));
        System.out.println("bookBorrowdate(dd/MM/yyyy): "+date.format(bookBorrowdate));
        System.out.println("bookReturnDate(dd/MM/yyyy): "+date.format(bookReturnDate));
        System.out.println("GPA: "+this.getGPA());
        System.out.println("Major: "+this.getMajor());
    }
    
    
}
