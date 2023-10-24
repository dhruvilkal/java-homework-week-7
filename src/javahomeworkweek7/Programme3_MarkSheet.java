package javahomeworkweek7;

import java.util.Scanner;

public class Programme3_MarkSheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input student information
        System.out.println("Enter student name :");
        String name = input.nextLine();

        System.out.println("Enter roll number:");
        int rollNo = input.nextInt();

        // Input marks for three subject
        System.out.println("Enter Math marks (0-100):");
        int mathMarks = input.nextInt();

        System.out.println("Enter Science marks(0-100):");
        int scienceMarks = input.nextInt();
        System.out.println("Enter English marks(0-100):");
        int englishMarks = input.nextInt();
// scanner close
        input.close();
   // Check if marks are in the valid range
        if (mathMarks< 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks < 0||scienceMarks>100 || englishMarks<0 ||englishMarks>100 ){
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }
        // Calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 300.0)*100;

        // Determine result and grade
        String result = (percentage>=35)?"Pass": "Fail";
        String grade ;
        if (percentage >= 80){
            grade ="A+";

        } else if (percentage >=60) {
            grade = "A";

        } else if (percentage>=50) {
            grade ="B";


        } else {
            grade = "C";


        }
        // Print the Mark Sheet
        System.out.println("_______________________________________________");
        System.out.println("|                                             |");
        System.out.println("|                  Mark Sheet                  |");
        System.out.println("|_______________________________________________|");
        System.out.println("| Name :"        + name);
        System.out.println("|Roll No: "       + rollNo);
        System.out.println("|_______________________________________________|");
        System.out.println("| Subject :    Marks                           |");
        System.out.println("|_______________________________________________|");
        System.out.println("| Math:"            +mathMarks);
        System.out.println("| Science : "+ scienceMarks);
        System.out.println("| English : "+ englishMarks);
        System.out.println("|_________________________________________________|");
        System.out.println("| Total : + totalMarks");
        System.out.println("|_____________________________________________________");
        System.out.println("| Percentage : " + percentage);
        System.out.println("| Result : "+result);
        System.out.println("| Grade:"   + grade);
        System.out.println("|____________________________________________________");

    }

}
