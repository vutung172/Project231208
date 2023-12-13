package Library.Main;

import java.util.Scanner;

public class SubMenu1 {
    public static void displayMenu() {
            System.out.println("__________MENU-Quản Lý Tác Giả__________");
            System.out.println("1. Thêm tác giả");
            System.out.println("2. Hiển thị tác giả");
            System.out.println("3. Cập nhật thông tin tác giả");
            System.out.println("4. Xóa tác giả");
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
