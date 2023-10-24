package javahomeworkweek7;

import java.util.Scanner;

public class Programme10_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter first number
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        // Enter second number
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();

        // Enter operation
        System.out.println("Enter the operation (+ , - , *,/):");
        char operator = scanner.next().charAt(0);
//scanner close
        scanner.close();
        double result = 0.0;

        // Apply if - else statment
        if (operator == '+'){
            result = a + b;

        } else if (operator == '-') {
            result= a-b;

        } else if (operator =='*') {
            result = a*b;

        } else if (operator =='/') {
            if (b ==0){
                System.out.println("Division by zero is not allowed");
                return;
            }
            result = a/b;


        }else {
            System.out.println("Invalid operator please enter + , -,*,/");
            return;
        }
        System.out.println("Result: "+ result);
    }
}
