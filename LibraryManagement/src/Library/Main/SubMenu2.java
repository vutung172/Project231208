package Library.Main;

import Library.ultity.AList;
import Library.ultity.Author;
import Library.ultity.Book;
import Library.ultity.Library;

import java.util.Scanner;

public class SubMenu2 {
    private static Library books = new Library();

    public static Library getBooks() {
        return books;
    }

    public static void displayMenu() {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("__________MENU-Quản Lý Sách__________");
            System.out.println("1. Thêm sách");
            System.out.println("2. Tìm kiếm sách theo tiêu đề");
            System.out.println("3. Tìm kiếm sách theo tên tác giả");
            System.out.println("4. Cập nhật sách");
            System.out.println("5. Quay lại");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    String select;
                    do {
                        Book book = new Book();
                        book.inputBook();
                        System.out.println(books.addBook(book));
                        System.out.println("Bạn có muốn tiếp tục (Y/N): ");
                        select = sc.nextLine();
                    } while (select.equalsIgnoreCase("y"));
                    break;
                case 2:
                    do {
                        System.out.println("Nhập vào tên sách muốn tìm: ");
                        String titleSearch = sc.nextLine();
                        System.out.printf("%-5s | %30s | %20s | %10s |\n ","ID","Tên sách","Tác giả","Giá sách");
                        books.searchBookByTitle(titleSearch);
                        System.out.println("Bạn có muốn tiếp tục (Y/N): ");
                        select = sc.nextLine();
                    } while (select.equalsIgnoreCase("y"));
                    break;
                case 3:
                    do {
                        System.out.println("Nhập vào tên tác giả tìm: ");
                        String authorSearch = sc.nextLine();
                        System.out.printf("%-5s | %30s | %20s | %10s |\n ","ID","Tên sách","Tác giả","Giá sách");
                        books.searchBookByAuthor(authorSearch);
                        System.out.println("Bạn có muốn tiếp tục (Y/N): ");
                        select = sc.nextLine();
                    } while (select.equalsIgnoreCase("y"));
                    break;
                case 4:
                    System.out.println("Nhập vào ID sách muốn cập nhật: ");
                    String id = sc.nextLine();
                    Book book = books.searchBookById(id);
                    if ( book != null) {
                        do {
                            System.out.printf("%-5s | %30s | %20s | %10s |\n ","ID","Tên sách","Tác giả","Giá sách");
                            book.displayBook();
                            System.out.println("Nhập vào thông tin muốn cập nhật");
                            System.out.println("1. Sửa tên sách");
                            System.out.println("2. Sửa tác giả");
                            System.out.println("3. Sửa giá");
                            System.out.println("4. Quay lại");
                            int c = Integer.parseInt(sc.nextLine());
                            switch (c) {
                                case 1:
                                    System.out.println("Nhập vào tên sách mới: ");
                                    book.setTitle(sc.nextLine());
                                    books.updateBook(book);
                                    System.out.println("Tên sách đã cập nhật");
                                    break;
                                case 2:
                                    Author a;
                                    do {
                                        System.out.println("Nhập vào ID tác giả mới: ");
                                        id = sc.nextLine();
                                        a = SubMenu1.getAuthors().searchAuthorById(id);
                                        if(a == null){
                                            System.out.println("Tác giả chưa có trong danh sách");
                                        }
                                        book.setAuthor(a);
                                        books.updateBook(book);
                                    } while(a == null);
                                    System.out.println("Tác giả đã cập nhật");
                                    break;
                                case 3:
                                    System.out.println("Nhập vào giá mới");
                                    book.setPrice(Double.parseDouble(sc.nextLine()));
                                    books.updateBook(book);
                                    System.out.println("Giá mới đã cập nhật");
                                    break;
                                case 4:
                                    SubMenu2.displayMenu();
                                    break;
                                default:
                                    System.out.println("Lựa chọn của bạn không phù hợp");
                            }
                        } while (true);

                    } else {
                        System.out.println("ID sách không tồn tại");
                    }
                    break;
                case 5:
                    MainMenu.displayMenu();
                    break;
                case 6:
                    books.showBook();
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không phù hợp");
            }
        } while (true);
    }
}
