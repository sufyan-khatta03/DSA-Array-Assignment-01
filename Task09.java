import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare an array of 10 integers
        int[] numbers = new int[10];

        // Take 10 integers from the user
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Check duplicate values in the array
        System.out.println("Duplicate elements:");

        for (int i = 0; i < numbers.length; i++) {

            int count = 1;
            boolean alreadyChecked = false;

            // Check whether this number was already counted
            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    alreadyChecked = true;
                    break;
                }
            }

            // Count how many times the number occurs
            if (!alreadyChecked) {

                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                    }
                }

                // Display only duplicate values
                if (count > 1) {
                    System.out.println(numbers[i] + " occurs " + count + " times");
                }
            }
        }

        input.close();
    }
}

