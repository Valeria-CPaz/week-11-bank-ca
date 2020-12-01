package com.val;

import java.util.Scanner;

public class Login extends Employee {

    Scanner scanner = new Scanner(System.in);
    String menu = "1 - Customer" +
            "\n 2 - Employee";

    String pinAccess = "A1234", pinInput;


    public void validation() {

        System.out.println(menu);
        int input = scanner.nextInt();

        if (input == 2) {
               do {
                   System.out.println("pin number: ");
                   scanner.nextLine();
                   pinInput = scanner.nextLine();
                   if (pinInput.equals(pinAccess)) {
                       System.out.println("You are in");
                       employeeAccess();
                   } else {
                       System.out.println("Wrong pin. Try again.");
                   }
               } while (!pinInput.equals(pinAccess));

        }

    }
}

