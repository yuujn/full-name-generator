package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your name!");
        System.out.print("First name: ");
        String firstName = scan.nextLine().trim();
        System.out.print("Middle name: ");
        String middleName = scan.nextLine().trim();
        System.out.print("Last name: ");
        String lastName = scan.nextLine().trim();
        System.out.print("Suffix: ");
        String suffix = scan.nextLine().trim();

        String fullName = String.format(
                "%s %s%s%s",
                firstName,
                middleName.isBlank() ? "" : String.format("%s ", middleName),
                lastName,
                suffix.isBlank() ? "" : String.format(", %s", suffix)
        );
        System.out.printf("Full name: %s%n", fullName);
    }
}
