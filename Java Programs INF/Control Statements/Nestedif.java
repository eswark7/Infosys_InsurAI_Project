import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.print("Enter your weight in kg: ");
        int weight = scan.nextInt();

        if (age >= 18) {
            if (weight > 50) {
                System.out.println(" You are eligible to donate blood.");
            } else {
                System.out.println(" You are not eligible to donate blood due to low weight.");
            }
        } else {
            System.out.println(" You must be at least 18 years old to donate blood.");
        }

        scan.close();
    }
}
