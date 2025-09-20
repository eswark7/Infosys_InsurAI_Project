import java.util.Random;

public class MathOperations {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(1000); //Generates a random number between 0 and 999
        System.out.println("The random number is : " + number);
        
        boolean isheads =random.nextBoolean();
        System.out.println("random (Head/Tail) : " + (isheads ? "Heads" : "Tails"));

        System.out.println("pi value : "+Math.PI);
        double result =Math.pow(4,2);
        System.out.println("the power of 4^2 is  : "+result);
        double squareRoot = Math.sqrt(2);
        System.out.println("the square root of 2 : "+squareRoot);
        //Math.round()  nearest integer
        //math.ceil()  round up
        //math.floor()  round down
        //math.max()  max of two numbers
        //math.min()  min of two numbers
        //math.abs()  positive value
        //math.random()  random number between 0 and 1                                          
    }
    
}

