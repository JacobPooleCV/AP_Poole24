package pkg;

public class Valentines {
     
    public void heart(String phrase) {
         
         
        // initializing variables and size
        double a, b, n = 10;
     
        // initializing String to print in heart
        String message = phrase;
     
        // Position from where from top
        // message box would be placed.
        int print_message = 4;
     
        // add space if message length is odd
        if (message.length() % 2 != 0)
            message += " ";
     
        // outer loop to adjust length of upper
        // part message is not handled in this part
        for (a = 0; a < n; a++) {
     
            // to print space and variable accordingly
            for (b = 0; b <= 4 * n; b++) {
         
                // computing distance to print variable
                double distance1 = Math.sqrt(Math.pow(a - n, 2)
                                         + Math.pow(b - n, 2));
                double distance2 = Math.sqrt(Math.pow(a - n, 2)
                                    + Math.pow(b - 3 * n, 2));
         
                if (distance1 < n + 0.5 || distance2 < n + 0.5)
                    System.out.print("S");
         
                else
                    System.out.print(" ");
            }
         
            // ending line after each iteration
            System.out.println();
        }
     
        // printing the message part
        // and lower part of heart.
        // outer loop handles
        // depth of the heart.
        for (a = 1; a < 2 * n; a++) {
     
            // for getting the lower curve of heart
            for (b = 0; b < a; b++)
                System.out.print(" ");
         
            // inner loop handles the message
            // and spaces accordingly
            for (b = 0; b < 4 * n + 1 - 2 * a; b++) {
         
                // checks if the height is in range
                // of message space
                if (a >= print_message - 1 &&
                             a <= print_message + 1) {
                     
                    double point = b - (4 * n - 2 * a
                                 - message.length()) / 2;
             
                    // prints message after leaving
                    // appropriate space
                    if (point < message.length() &&
                                          point >= 0) {
                        if (a == print_message)
                            System.out.print
                               (message.charAt((int)point));
                        else
                            System.out.print(" ");
                    }
             
                    else
                        System.out.print("S");
                }
         
                else
                    System.out.print("S");
            }
         
            System.out.println();
        }
    }
}