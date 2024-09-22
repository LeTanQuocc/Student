package student5;

import java.util.Date;

public abstract class Person implements IPerson {

    String id;
    String fullname;
    Date dateOfBirth;
    Date bookBorrowdate;
    Date bookReturnDate;

    public Person(String id, String fullname, Date dateOfBirth, Date bookBorrowdate, Date bookReturnDate) {
        this.id = id;
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowdate = bookBorrowdate;
        this.bookReturnDate = bookReturnDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getBookBorrowdate() {
        return bookBorrowdate;
    }

    public void setBookBorrowdate(Date bookBorrowdate) {
        this.bookBorrowdate = bookBorrowdate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public Person() {
    }

    Boolean isBookOverdue(){
        long dif=bookReturnDate.getTime()-bookBorrowdate.getTime();
        long days = dif / (1000 * 60 * 60 * 24);
        return days>=30;
    }
    @Override
    public void displayInfo() {

    }

    @Override
    public void updatePerson(String id) {

    }

    @Override
    public void addPerson() {

    }

}
