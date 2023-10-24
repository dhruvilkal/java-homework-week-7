package javahomeworkweek7;

public class Programme20_SpecificValue {
    public static boolean containsValue(int[] array, int target){
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                return true; // Found the target value
            }
        }
        return false; // if target value not found in the array
    }

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8};
        int targetvalue = 9;

        if (containsValue(numbers,targetvalue)){
            System.out.println("The array contains the value"+ targetvalue);
        }else {
            System.out.println("The array does not contain the value"+ targetvalue);
        }
    }
}
