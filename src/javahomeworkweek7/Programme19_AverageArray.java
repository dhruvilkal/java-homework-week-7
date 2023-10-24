package javahomeworkweek7;

public class Programme19_AverageArray {
    public static void main(String[] args) {


    // Initialize an array
    int[] numbers = {10,23,34,56,89};

    // Initialize a variable to store the sum
    int sum = 0;

    // Iterate through the array to calculate the sum
    for (int number : numbers){
        sum += number;

    }
    //Calculate the average
    double average =(double) sum / numbers.length;
    // print the average
    System.out.println("Average:" + average);

    }

}
