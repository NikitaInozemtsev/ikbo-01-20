package gh;

import javax.swing.*;

public class Insertion {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student("Egor", 17, 345);
        arr[1] = new Student("Nikita", 18, 13);
        arr[2] = new Student("Sergey", 18, 200);
        arr[3] = new Student("Dmitriy", 19, 92);
        arr[4] = new Student("Valeriy", 20, 173);

        for (int left = 0; left < arr.length; left++) {

            Student value = arr[left];

            int i = left - 1;
            for (; i >= 0; i--) {

                if (value.getIdNumber() < arr[i].getIdNumber()) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

    }


}

class Student {

    private String name;
    private int age;
    private int idNumber;

    public Student(String name, int age, int idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                ", age=" + age +
                ", idNumber=" + idNumber +
                '}';
    }
}