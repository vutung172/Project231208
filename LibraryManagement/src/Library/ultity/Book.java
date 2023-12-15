package Library.ultity;

import Library.Main.SubMenu1;
import Library.itf.ILibrary;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    private String id;
    private String title;
    private Author author;
    private double price;

    public Book() {
    }

    public Book(String id, String title, Author author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void inputBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ID: ");
        id = sc.nextLine();
        System.out.println("Nhập vào tên sách: ");
        title = sc.nextLine();
        Author a;
        do {
            System.out.println("Nhập vào ID tác giải");
            String id = sc.nextLine();
            a = SubMenu1.getAuthors().searchAuthorById(id);
            if (a == null)
                System.out.println("Tác giả không tồn tại");
            author = a;
        } while (a == null);
        System.out.println("Nhập vào giá sách:");
        price = Double.parseDouble(sc.nextLine());
    }


    public void displayBook() {
        System.out.printf("%-5s | %30s | %20s | %10s |\n", id, title, author.getName(), price);
    }
}
