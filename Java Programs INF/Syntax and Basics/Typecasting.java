public class Typecasting {
    public static void main(String[] args) {
        // Widening Casting (Automatic)
        int a = 10;
        double b = a; // int to double

        System.out.println("Widening Casting:");
        System.out.println("int value: " + a);
        System.out.println("double value: " + b);

        // Narrowing Casting (manual)
        double x = 9.78;
        int y = (int) x; // double to int

        System.out.println("\nNarrowing Casting:");
        System.out.println("double value: " + x);
        System.out.println("int value: " + y);
    }
    
}

/*
 Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

*/