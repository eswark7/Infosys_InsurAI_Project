import java.util.Scanner;

public class Ifelseif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = scan.nextInt();

      
        if (marks < 50) {
            System.out.println("Fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        }

        scan.close();
    }
}

/*
The Java if statement is used to test the condition. It checks the Boolean condition: true or false. There are mainly four types of if statements in Java.

if statement
if-else statement
if-else-if ladder

*/