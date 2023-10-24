package javahomeworkweek7;

import java.util.Scanner;

public class Programme2_FindLeapYear {
    public static void main(String[] args) {
        // Create a Scanner object for input from the user
        Scanner scanner = new Scanner(System.in);

        // the user enter any year
        System.out.println("Enter a year:");

        // Read the input year
        int year = scanner.nextInt();

        // Check if it is leap year or not with if - else statements
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This is a leap year: " + year);

        } else {
            System.out.println("This is not leap year:" + year);

        }
        // close scanner
        scanner.close();
    }
}
