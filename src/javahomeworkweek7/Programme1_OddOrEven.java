package javahomeworkweek7;

import java.util.Scanner;

public class Programme1_OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        String result = (number% 2== 0) ? "even": "odd";
        System.out.println("The input number is "+ result);
        scanner.close();
    }

}
