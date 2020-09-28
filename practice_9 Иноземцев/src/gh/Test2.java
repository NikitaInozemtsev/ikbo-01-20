package gh;

import java.util.*;

public class Test2 {
    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException {
        LabClassUI classUI = new LabClass().getClassUI();
        List<Student> arr = new ArrayList<>();
        arr.add(new Student(334,45,"Nikita","Smirnov","Valeryevich"));
        arr.add(new Student(215,10,"Oleg","Ivanov","Sergeyevich"));
        arr.add(new Student(347,15,"Valeriy","Lev","Dmitrievich"));
        arr.add(new Student(500,70,"Ivan","Vele","Petrovich"));

        classUI.addStudents(arr);
        System.out.println(classUI);


        classUI.sortByLastName();
        System.out.println("Sorted by SurName");
        System.out.println(classUI);

        classUI.sortByMark();
        System.out.println("Sorted by Mark");
        System.out.println(classUI);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name of a student: ");
        System.out.println(classUI.findStudent(scan.next(), scan.next(), scan.next()));
    }
}

class EmptyStringException extends Exception{
    public EmptyStringException(String er) {
        super(er);
    }
}

class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String no_student_found) {
        super("Student not found");
    }
}

interface LabClassUI  {

    public void sortByMark();
    public void sortByLastName();
    public void addStudent(Student st) throws EmptyStringException;
    public List<Student> getStudents();
    public void addStudents(List<Student> list);


    public Student findStudent(String name, String surName, String secondName) throws StudentNotFoundException;


}

class LabClass {
    LabClassUI classUI;
    public LabClass () {
        this.classUI = new LabClassDriver();
    }

    public LabClassUI getClassUI() {
        return classUI;
    }

    @Override
    public String toString() {
        return classUI.toString();
    }
}

class LabClassDriver implements LabClassUI{

    private ArrayList<Student> arr;

    @Override
    public Student findStudent(String firstName, String secondName, String surName) throws StudentNotFoundException {
        for (Student st : arr) {
            if (st.getFirstName().equals(firstName) &&
                    st.getSurName().equals(surName) &&
                    st.getSecondName().equals(secondName)) {

                return st;
            }

        }
        throw new StudentNotFoundException("No Student found");
    }

    @Override
    public void addStudents(List<Student> list) {
        arr.addAll(list);
    }

    public LabClassDriver() {
        arr = new ArrayList<>();
    }

    public void addStudent(Student student) throws EmptyStringException {
        arr.add(student);
    }

    @Override
    public void sortByLastName() {
        arr.sort(Comparator.comparing(Student::getSurName));
    }

    @Override
    public void sortByMark() {
        Collections.sort(arr);
    }
    public List<Student> getStudents() {
        return arr;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("--------------Students---------------\n");

        for (Student st : arr) {
            str.append(st.getFirstName()).append(" ").append(st.getSecondName()).append(" ").append(st.getSurName()).append(" ").append(st.getGrade()).append("\n");
        }

        return str.toString();
    }
}

class Student implements Comparable<Student> {
    private String firstName;
    private String secondName;
    private String surName;
    private int iDNumber;
    private Integer grade;

    public Student(int iDNumber, Integer grade, String firstName, String surName, String secondName) throws EmptyStringException {
        if (firstName.isEmpty() || surName.isEmpty() || secondName.isEmpty()) {
            throw new EmptyStringException("Some input is empty");
        }
        this.iDNumber = iDNumber;
        this.firstName = firstName;
        this.surName = surName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student o) {
        return this.grade.compareTo(o.getGrade());

    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surName='" + surName + '\'' +
                ", iDNumber=" + iDNumber +
                ", grade=" + grade +
                '}';
    }


}
