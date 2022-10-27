import java.util.Scanner;

public class NestedConditions {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Provide your age");
        int Age = console.nextInt();

        if (Age >= 1 && Age <= 10 ) {
            System.out.println("Child");
        } else {
            if(Age >= 11 && Age <= 19 ) {
                System.out.println("Teenager");
            }
            else {
                if(Age >= 20 && Age <= 120 ) {
                    System.out.println("Adult");
            }
                else {System.out.println("Invalid number");}
            }

        }



    }
}
