package Library.Main;

import Library.ultity.AList;
import Library.ultity.Author;

import java.util.Scanner;

public class SubMenu1 {
    private static AList authors = new AList();

    public static AList getAuthors() {
        return authors;
    }


    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("__________MENU-Quản Lý Tác Giả__________");
            System.out.println("1. Thêm tác giả");
            System.out.println("2. Hiển thị tác giả");
            System.out.println("3. Cập nhật thông tin tác giả");
            System.out.println("4. Xóa tác giả");
            System.out.println("5. Quay lại");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: //Thêm tác giả
                    String select;
                    do {
                        Author author = new Author();
                        author.inputAuthor();
                        authors.add(author);
                        System.out.println("Bạn có muốn tiếp tục (Y/N): ");
                        select = sc.nextLine();
                    } while (select.equalsIgnoreCase("y"));
                    break;
                case 2: //Hiển thị tác giả
                    System.out.printf("%-5s | %20s | %20s | %10s | %5s | \n", "ID", "Tên tác giả", "Email", "Giới tính", "Tuổi");
                    authors.showAuthor();
                    break;
                case 3: //Cập nhật thông tin tác giả (theo id)
                    System.out.println("Nhập vào ID tác giả muốn cập nhật: ");
                    String id = sc.nextLine();
                    Author author = authors.searchAuthorById(id);
                    if (author != null) {
                        do {

                            System.out.printf("%-5s | %20s | %20s | %10s | %5s | \n", "ID", "Tên tác giả", "Email", "Giới tính", "Tuổi");
                            author.displayAuthor();
                            System.out.println("Nhập vào thông tin muốn cập nhật");
                            System.out.println("1. Tên tác giả");
                            System.out.println("2. Email tác giả");
                            System.out.println("3. Giới tính tác giả");
                            System.out.println("4. Tuổi tác giả");
                            System.out.println("5. Quay lại");
                            int c = Integer.parseInt(sc.nextLine());
                            switch (c) {
                                case 1:
                                    System.out.println("Nhập vào tên tác giả mới: ");
                                    author.setName(sc.nextLine());
                                    authors.updateAuthor(author);
                                    System.out.println("Tên tác giả đã cập nhật");
                                    break;
                                case 2:
                                    System.out.println("Nhập vào emial mới: ");
                                    author.setEmail(sc.nextLine());
                                    authors.updateAuthor(author);
                                    System.out.println("Email đã cập nhật");
                                    break;
                                case 3:
                                    System.out.println("Nhập vào giới tính mới");
                                    author.setGender(sc.nextLine());
                                    authors.updateAuthor(author);
                                    System.out.println("Giới tính đã cập nhật");
                                    break;
                                case 4:
                                    System.out.println("Nhập vào tuổi mới");
                                    author.setName(sc.nextLine());
                                    authors.updateAuthor(author);
                                    System.out.println("Tuổi đã cập nhật");
                                    break;
                                case 5:
                                    SubMenu1.displayMenu();
                                    break;
                                default:
                                    System.out.println("Lựa chọn của bạn không phù hợp");
                            }
                        } while (true);

                    } else {
                        System.out.println("Tác giả không tồn tại");
                    }
                    break;
                case 4: //Xóa tác giả (Không xóa tác giả có đã sách)
                    System.out.println("Nhập vào ID tác giả muốn xóa: ");
                    id = sc.nextLine();
                    authors.delete(id);
                    break;
                case 5:
                    MainMenu.displayMenu();
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không phù hợp");
            }
        } while (true);
    }
}
