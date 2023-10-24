package javahomeworkweek7;

import java.util.Scanner;

public class Programme6_OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
// scnner close
        scanner.close();
        if (number % 2==0){
            System.out.println("The number is even:"+ number);

        }else{
            System.out.println("The number is odd: "+number);


        }
    }
}
