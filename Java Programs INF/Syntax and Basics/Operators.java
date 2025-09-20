public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // 15
        System.out.println("a - b = " + (a - b)); // 5
        System.out.println("a * b = " + (a * b)); // 50
        System.out.println("a / b = " + (a / b)); // 2
        System.out.println("a % b = " + (a % b)); // 0
        System.out.println("++a = " + (++a));     // 11
        System.out.println("--b = " + (--b));     // 4

        // Assignment Operators 
        int x = 10;
        System.out.println("\nAssignment Operators:");
        x += 5; 
        System.out.println("x += 5: " + x); 
        x -= 3;
        System.out.println("x -= 3: " + x); 
        x *= 2;
        System.out.println("x *= 2: " + x); 
        x /= 4;
        System.out.println("x /= 4: " + x); 
        x %= 4;
        System.out.println("x %= 4: " + x);

        // Comparison Operators
        int p = 7, q = 5;
        System.out.println("\nComparison Operators:");
        System.out.println("p == q: " + (p == q)); 
        System.out.println("p != q: " + (p != q)); 
        System.out.println("p > q: " + (p > q));  
        System.out.println("p < q: " + (p < q));
        System.out.println("p >= q: " + (p >= q));
        System.out.println("p <= q: " + (p <= q)); 

        // Logical Operators
        boolean cond1 = true, cond2 = false;
        System.out.println("\nLogical Operators:");
        System.out.println("cond1 && cond2: " + (cond1 && cond2)); // false
        System.out.println("cond1 || cond2: " + (cond1 || cond2)); // true
        System.out.println("!cond1: " + (!cond1));                 // false

        // Bitwise Operators
        int m = 5, n = 3;  // 0101 & 0011
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n: " + (m & n));   // 1 0001-1 if both bits are 1
        System.out.println("m | n: " + (m | n));   // 7 If either bit is 1, the result is 1
        System.out.println("m ^ n: " + (m ^ n));   // 6  0110-1 if bits are different
        System.out.println("m >> 1: " + (m >> 1)); // 2  5 >> 1 → 0101 → 0010 (2) Shifts bits to the right
        System.out.println("m << 1: " + (m << 1)); // 10 Shifts bits to the left, adds 0 on right 5 << 1 → 0101 → 1010 (10)

        }
    }