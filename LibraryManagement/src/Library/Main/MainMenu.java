package Library.Main;

import java.awt.*;
import java.util.Scanner;

public class MainMenu {
    public static void displayMenu(){
        System.out.println("__________MENU - Chính__________");
        System.out.println("1. Quản lý tác giả");
        System.out.println("2. Quản lý sách");
        System.out.println("3. Thoát");
        System.out.print("Lựa chọn của bạn: ");
        do {
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    SubMenu1.displayMenu();
                    break;
                case 2:
                    SubMenu2.displayMenu();
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không phù hợp");
                    System.out.print("Mời bạn chọn lựa chọn khác: ");
            }
        } while (true);
    }
}
