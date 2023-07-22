/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
// Person.java
public class Person {
    // Atribut
    private String name;
    private int age;

    // Method Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method Accessor
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method Mutator
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method lainnya
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

