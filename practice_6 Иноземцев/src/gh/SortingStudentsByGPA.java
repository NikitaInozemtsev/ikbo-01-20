package gh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class SortingStudentsByGPA implements Comparator<Student1> {


    public int compare(Student1 a, Student1 b) {
        if(a.getPoints() > b.getPoints())
            return -1;
        else if(a.getPoints()< b.getPoints())
            return 1;
        else
            return 0;
    }
}

class Student1 {
    private String name;
    private int points;
    private int idNumber;

    public Student1(String name, int points, int idNumber) {
        this.name = name;
        this.points = points;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", idNumber=" + idNumber +
                '}';
    }
}

class Fast {
    public static void main(String[] args) {

        SortingStudentsByGPA pcomp = new SortingStudentsByGPA();
        ArrayList<Student1> arr = new ArrayList<>();
        arr.add(new Student1("Sergey", 35, 99));
        arr.add(new Student1("Nikita", 10, 24));
        arr.add(new Student1("Valeriy", 56, 3));
        arr.add(new Student1("Egor", 78, 15));
        arr.add(new Student1("Oleg", 26, 77));

        arr.sort(pcomp);

        for (Student1 sd: arr) {
            System.out.println(sd);
        }

    }
}
