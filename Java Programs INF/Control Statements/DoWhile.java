public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
         do
        {
         System.out.println("KE = "+i);
         
         i++;
        }
        while (i<=4);

    }
    
}

/*
 The code inside the do block always runs at least once, even if the condition is false.

After that, the while condition is checked.

If the condition is true, it runs again.

If false, it stops.
 */