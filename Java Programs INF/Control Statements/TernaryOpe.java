import java.util.*;

public class TernaryOpe {
   public static void main(String[] args){
        //variable = (condition)?iftrue : iffalse;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number to find even or odd :");
        int num = scan.nextInt();
        System.out.println("number is : "+num);
        String evenorodd = (num%2 == 0 )? "EVEN":"ODD";
        System.out.println(evenorodd);
    
    scan.close();
    }
    
}

/*
There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements: 

variable = (condition) ? expressionTrue :  expressionFalse;

*/