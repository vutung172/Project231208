package Library.ultity;

import Library.itf.ILibrary;

import java.util.Scanner;

public class Author {

    private String id;
    private String name;
    private String email;
    private String gender;
    private int age;

    public Author() {
    }

    public Author(String id, String name, String email, String gender, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void inputAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ID: ");
        id = sc.nextLine();
        System.out.println("Nhập vào tên: ");
        name = sc.nextLine();
        System.out.println("Nhập vào email: ");
        email = sc.nextLine();
        System.out.println("Nhập vào giới tính: ");
        gender = sc.nextLine();
        System.out.println("Nhập vào tuổi: ");
        age = Integer.parseInt(sc.nextLine());

    }


    public void displayAuthor() {
        System.out.printf("%10s :Tác giả là: %s, email: %s, giới tính: %s, tuổi: %s.",id,name,email,gender,age);
    }


}
