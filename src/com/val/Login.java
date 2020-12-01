package com.val;

import java.util.Scanner;

public class Login {

    Scanner scanner = new Scanner(System.in);
    String menu = "1 - Customer" +
            "\n 2 - Employee";
    int input = scanner.nextInt();
    String pinAccess = "A1234";


    public void validation() {

        System.out.println(menu);
        if (input == 2) {
            while (pinAccess != "A1234") {
                scanner.nextLine();
                System.out.println("pin number: ");
                pinAccess = scanner.nextLine();
                if (pinAccess == "A1234") {
                    System.out.println("Access granted");
                } else {
                    System.out.println("Wrong pin. Try again.");
                }
            }
        }
    }
}
