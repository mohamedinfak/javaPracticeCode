public class CommandLineSum {
    public static void main(String[] args) {
        // Initialize a variable to store the sum
        int sum = 0;

        // Iterate through the command line arguments and add them to the sum
        for (int i = 0; i < args.length; i++) {
            // Check if the argument is a valid number
            
            if (isNumeric(args[i])) {
                sum += Integer.parseInt(args[i]);
            }
        }

        // Output the sum
        System.out.println("The sum is: " + sum);
    }

    // Helper method to check if a string is a valid number
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
