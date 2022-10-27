import java.util.Scanner;

public class conditionals {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Provide the first number: ");
        int First = console.nextInt();
        System.out.println("Provide the second number: ");
        int Second = console.nextInt();

        if (First < Second) {
            System.out.println(Second + " is a bigger number");
        } else if (First > Second) {
            System.out.println(First + " is a bigger number");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}

