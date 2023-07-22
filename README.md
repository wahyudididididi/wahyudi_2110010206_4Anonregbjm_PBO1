# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `main`, `person`, dan `student` adalah contoh dari class.

```bash
public class main {
    ...
}

public class person {
    ...
}

public class student {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Person person1 = new Person("John Doe", 30);` adalah contoh pembuatan object.

```bash
Person person1 = new Person("John Doe", 30);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `name` dan `age` adalah contoh atribut.

```bash
 private String name;
    private int age;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `person`.

```bash
 public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setName` adalah contoh method mutator.

```bash
  public void setName(String name) {
        this.name = name;
    }

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getName` adalah contoh method accessor.

```bash
 public String getName() {
        return name;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `name` dan `age` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String name;
    private int age;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `person` dengan sintaks `extends`.

```bash
public class Student extends Person {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. 

```bash
public class Main {
    public static void main(String[] args) {
        // Membuat objek Person dan Student
        Person person1 = new Person("John Doe", 30);
        Student student1 = new Student("Alice", 20, "S001");

        // Memanggil metode introduce menggunakan polimorfisme
        introducePerson(person1);
        introducePerson(student1); // Kita bisa memperlakukan student1 sebagai Person
    }

    // Metode yang menggunakan polimorfisme
    public static void introducePerson(Person person) {
        person.introduce();
    }
}

// Kelas Person dan Student sama seperti sebelumnya

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. 

```bash
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input nama dan umur dari pengguna dengan error handling
        String name = "";
        int age = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print("Masukkan nama Anda: ");
                name = scanner.nextLine();

                System.out.print("Masukkan umur Anda: ");
                age = scanner.nextInt();
                scanner.nextLine(); // Membuang karakter newline (\n) yang tersisa setelah nextInt()

                validInput = true;
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Membuang karakter newline (\n) yang tersisa setelah nextInt()
                System.out.println("Input umur harus berupa angka.");
            }
        } while (!validInput);

        // Membuat objek Person berdasarkan input pengguna
        Person person1 = new Person(name, age);

        // Menentukan kategori berdasarkan umur
        String category;
        if (age < 12) {
            category = "anak-anak";
        } else if (age < 18) {
            category = "remaja";
        } else {
            category = "dewasa";
        }

        // Memanggil method introduce untuk objek Person
        person1.introduce();

        // Menampilkan kategori umur
        System.out.println("Anda termasuk dalam kategori: " + category);

        scanner.close();
    }
}

// Kelas Person dan Student sama seperti sebelumnya

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
 for (Person person : people) {
            person.introduce();
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline (\n) yang tersisa setelah nextInt()

    
        Person person1 = new Person(name, age);

       
        person1.introduce();

       
        System.out.print("Masukkan nama mahasiswa: ");
        String studentName = scanner.nextLine();

        System.out.print("Masukkan umur mahasiswa: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline (\n) yang tersisa setelah nextInt()

        System.out.print("Masukkan student ID mahasiswa: ");
        String studentId = scanner.nextLine();
        Student student1 = new Student(studentName, studentAge, studentId);
student1.introduce();

        scanner.close();
    }
}

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Person[] people = new Person[numData];`Student[] students = new Student[numData];' dan' adalah contoh penggunaan array.

```bash
Person[] people = new Person[numData];
        Student[] students = new Student[numData];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        boolean validInput = false;

        do {
            try {
                System.out.print("Masukkan nama Anda: ");
                name = scanner.nextLine();

                System.out.print("Masukkan umur Anda: ");
                age = scanner.nextInt();
                scanner.nextLine(); // Membuang karakter newline (\n) yang tersisa setelah nextInt()

                validInput = true;
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Membuang karakter newline (\n) yang tersisa setelah nextInt()
                System.out.println("Input umur harus berupa angka.");
            }
        } while (!validInput);
        Person person1 = new Person(name, age);
        person1.introduce();

        scanner.close();
    }
}

```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: wahyudi
NPM: 2110010206
