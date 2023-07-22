/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Person
        Person person1 = new Person("John Doe", 30);

        // Menggunakan method accessor
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Menggunakan method mutator
        person1.setName("Jane Doe");
        person1.setAge(35);

        // Memanggil method introduce
        person1.introduce();

        // Membuat objek Student (kelas turunan)
        Student student1 = new Student("Alice", 20, "S001");

        // Memanggil method introduce untuk objek Student
        student1.introduce();
    }
}

