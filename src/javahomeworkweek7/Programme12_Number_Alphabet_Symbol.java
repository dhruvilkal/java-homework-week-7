package javahomeworkweek7;

import java.util.Scanner;

public class Programme12_Number_Alphabet_Symbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter a Character
        System.out.println("Enter a charcter: ");
        char inputChar = scanner.next().charAt(0);

        // scanner close
          scanner.close();
        if (Character.isDigit(inputChar)){
            System.out.println("Input is a number");
        } else if (Character.isLetter(inputChar)) {
            System.out.println("Input is an alphabet");

        }else{
            System.out.println("Input is a symbol or a combination of characters");
        }


    }
}
