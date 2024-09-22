package student5;

import java.util.ArrayList;

public class PersonList {

    ArrayList<Person> personList;

    public PersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public void addStudent() {
        Student student = new Student();
        student.addPerson();
        this.personList.add(student);
        System.out.println("da cap nhat thong tin hoc sinh");
    }

    public void addTeacher() {
        Teacher teacher = new Teacher();
        teacher.addPerson();
        this.personList.add(teacher);
        System.out.println("da cap nhat thong tin giao vien");

    }

    public void updatePerson(String id) {
        Person update = findPersonById(id);
        update.updatePerson(id);
        System.out.println("da cap nhat");
    }

     Person findPersonById(String id) {
        for (int i = 0; i < personList.size(); i++) {
            Person person = this.personList.get(i);
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void deletePersonById(String id) {
        Person dele = findPersonById(id);
        dele.updatePerson(id);
        System.out.println("da xoa ");
    }

    public void displayEveryone() {
        for (int i = 0; i < this.personList.size(); i++) {
            Person person = this.personList.get(i);
            person.displayInfo();
            System.out.println("----------");
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        for (int i = 0; i < personList.size(); i++) {
            Person person = this.personList.get(i);
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGPA() > topStudent.getGPA()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;

    }

    public Teacher findTeacherByDepartment() {
        Teacher teachers = null;
        for (int i = 0; i < personList.size(); i++) {
            Person person = this.personList.get(i);
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(teacher)) {
                }
            }
        }

        return null;

    }

    public void checkBookBorrowing() {
        for (Person p : this.personList) {
            if (!p.isBookOverdue()) {
                System.out.println("No overdue");
            } else {
                System.out.println("Overdue");
            }
        }
    }

}
