package FuramaResort.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        String mainMenu = ("1. Employee Management: \n" +
                "2. Customer Management: \n" +
                "3. Facility Management \n" +
                "4. Booking Management \n" +
                "5. Promotion Management \n" +
                "6. Exit");
        int chosen;
        do {
            System.out.println(mainMenu);
            chosen = sc.nextInt();
            int enter = -1;
            switch (chosen) {
                case 1:
                    do {
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        enter = sc.nextInt();
                        switch (enter) {
                            case 4:
                                System.out.println(mainMenu);
                                enter = sc.nextInt();
                        }
                    } while (enter > 4);
                case 2:
                    while (enter < 4) {
                        System.out.println("1. Display list customer");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4. Return main menu");
                        enter = sc.nextInt();
                    }
                case 3:
                    while (enter < 4) {
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        enter = sc.nextInt();
                    }
                case 4:
                    while (enter < 4) {
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Create new contracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");
                        enter = sc.nextInt();
                    }
                case 5:
                    while (enter < 4) {
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");
                        enter = sc.nextInt();
                    }
                case 6:
                    System.exit(0);
                default:
                    System.out.println("No choice!!!");
            }
        } while (chosen > 6);
    }

    ;

    public static void main(String[] args) {
        FuramaController.displayMainMenu();
    }
}
