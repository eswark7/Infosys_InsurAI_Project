public class BreakContinue {
    public static void main(String[] args) {
    
    
    // Continue - To skip the current iteration and go to the next one.
    // Break - To exit the loop immediately when a certain condition is met.
   for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                System.out.println("Skipping 5 using continue...");
                continue;
            }

            if (i == 8) {
                System.out.println("Stopping at 8 using break...");
                break;
            }

            System.out.println("i = " + i);
        }
    }
}