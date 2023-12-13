package Library.Main;

import java.util.Scanner;

public class SubMenu2 {
    public static void displayMenu() {
        System.out.println("__________MENU-Quản Lý Sách__________");
        System.out.println("1. Thêm sách");
        System.out.println("2. Tìm kiếm sách theo tiêu đề");
        System.out.println("3. Tìm kiếm sách theo tên tác giả");
        System.out.println("4. Cập nhật sách");
        System.out.println("5. Quay lại");
    }

    public static void selectOption() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    MainMenu.displayMenu();
                    MainMenu.selectOption();
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không phù hợp");
            }
        } while (true);
    }
}
