package javahomeworkweek7;

public class Programme18_SumValue {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7};
        int sum = sumArray(numbers);
        System.out.println("Sum of the array: "+ sum);
    }
    public static int sumArray(int[] arr){
        int sum = 0;
        for (int i = 0; i <arr.length; i++){
            sum += arr[i];

        }
        return sum;

    }
}
