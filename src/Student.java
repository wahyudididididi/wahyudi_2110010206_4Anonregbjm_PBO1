/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
// Student.java
public class Student extends Person {
    // Atribut tambahan khusus Student
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // Method Accessor
    public String getStudentId() {
        return studentId;
    }

    // Method lainnya
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + getName() + ", I am " + getAge() + " years old, and my student ID is " + studentId + ".");
    }
}

