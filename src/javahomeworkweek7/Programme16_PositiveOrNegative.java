package javahomeworkweek7;

import java.util.Scanner;

public class Programme16_PositiveOrNegative {
    public static void main(String[] args) {
        // create scanner object for input number
        Scanner scanner = new Scanner(System.in);

        // enter any number
        int number = scanner.nextInt();
        // scanner close
        scanner.close();
        // check if it is Positive or Negative by using if - else statement
        if (number > 0 ){
            System.out.println("The enter number is POSITIVE");
        } else if (number < 0) {
            System.out.println("The enter number is NEGATIVE");

        }else {
            System.out.println("The enter number is ZERO");

        }



    }
}
