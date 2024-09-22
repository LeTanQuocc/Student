package student4;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

     ArrayList<Person> person;

    public PersonList(ArrayList<Person> person) {
        this.person = person;
    }

    public PersonList() {
        this.person = new ArrayList<>();
    }

    public void addStudent() {
        Student student = new Student();
        student.addPerson();
        this.person.add(student);
        System.out.println("da cap nhat thong tin hoc sinh");
    }

    public void addTeacher() {
        Teacher teacher = new Teacher();
        teacher.addPerson();
        this.person.add(teacher);
        System.out.println("da cap nhat thong tin giao vien");

    }

    public void updatePerson(String id) {
        Person update = findPersonById(id);
        update.updatePerson();
        System.out.println("da cap nhat");


    }

    public void deletePersonById(String id) {
        Person dele = findPersonById(id);
        dele.updatePerson();
        System.out.println("da xoa ");

    }

    Person findPersonById(String id) {
        for (int i = 0; i < person.size(); i++) {
            Person person = this.person.get(i);
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void displayEveryone() {
        for (int i = 0; i < this.person.size(); i++) {
            Person person = this.person.get(i);
            person.displayInfo();
            System.out.println("----------");
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        for (int i = 0; i < person.size(); i++) {
            Person person = this.person.get(i);
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGPA() > topStudent.getGPA()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;

    }

    Teacher findTeacherByDepartment(String department) {
        Teacher teachers = null;
        for (int i = 0; i < person.size(); i++) {
            Person person = this.person.get(i);
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                }
            }
        }
        return teachers;
    }
}
