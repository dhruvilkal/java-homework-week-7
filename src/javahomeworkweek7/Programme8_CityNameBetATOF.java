package javahomeworkweek7;

import java.util.Scanner;

public class Programme8_CityNameBetATOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet from A to F:");
        String inputAlphabet = scanner.next();
        //scanner close
        scanner.close();
        // alphabet input with if-else statement
        if (inputAlphabet.equals("A")){
            System.out.println("City: Atlanta");
        } else if (inputAlphabet.equals("B")) {
            System.out.println("City: Boston");

        } else if (inputAlphabet.equals("C")) {
            System.out.println("City: Chicago");

        } else if (inputAlphabet.equals("D")) {
            System.out.println("City: Denver");

        } else if (inputAlphabet.equals("E")) {
            System.out.println("City:Eluru");

        } else if (inputAlphabet.equals("F")) {
            System.out.println("City:Fresno");

        }else {
            System.out.println("Invalid Alphabet");
        }

    }

}
