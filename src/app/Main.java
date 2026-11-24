package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        
    }


    
    // MAIN HELPER METHODS

    // readInt - verifies and returns an int input. Also allows a custom prompt, min range, and max range
    private static int readInt(
    Scanner input, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);

            if (!input.hasNextInt()) 
                {
                    System.out.println("Please enter a valid integer value.");
                    input.next(); 
                    continue;
                }

            int value = input.nextInt();

            if (value >= min && value <= max) 
                {
                    input.nextLine(); 
                    return value;
                }

            System.out.println("Enter a number from " + min + " to " + max + ".");
        }
    }        
}
