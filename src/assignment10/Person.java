package assignment10;

import java.util.Date;

public abstract class Person implements IPerson {

    String Id;
    String fullname;
    Date dateOfBirth;

    public Person(String Id, String fullname, Date dateOfBirth) {
        this.Id = Id;
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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

    @Override
    public abstract void displayinfor();
}
