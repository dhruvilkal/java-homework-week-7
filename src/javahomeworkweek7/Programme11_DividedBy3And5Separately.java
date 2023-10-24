package javahomeworkweek7;

public class Programme11_DividedBy3And5Separately {
    public static void main(String[] args) {
        System.out.println("Number divided by 3: ");
        for (int i = 1; i<=100; i++){
            if (i % 3 == 0){
                System.out.println(i + " ");
            }
        }
        System.out.println("\nNumbers divided by 5: ");
        for (int i =1; i<=100; i++){
            if (i % 5 ==0){
                System.out.println(i + " ");
            }
        }
    }
}
