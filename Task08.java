public class Task08 {
      public static void main(String[] args) {

        // Declare an array of 10 integers
        int[] numbers = {50, 20, 90, 10, 40, 70, 30, 100, 60, 80};

        // Temporary variable used for swapping
        int temp;

        // Outer loop controls the number of passes
        for (int i = 0; i < numbers.length - 1; i++) {

            // Inner loop compares adjacent elements
            for (int j = 0; j < numbers.length - 1 - i; j++) {

                // Check if the current element is greater
                // than the next element
                if (numbers[j] > numbers[j + 1]) {

                    // Swap elements using temp variable
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Display array in ascending order
        System.out.println("Ascending Order:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display array in descending order
        System.out.println("\nDescending Order:");

        // Start from the last index and move backwards
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}

    
