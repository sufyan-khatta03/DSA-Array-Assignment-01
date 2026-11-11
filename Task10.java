import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare first array of 5 integers
        int[] array1 = new int[5];

        // Declare second array of 5 integers
        int[] array2 = new int[5];

        // Declare third array to merge both arrays
        int[] mergedArray = new int[10];

        // Take input for first array in ascending order
        System.out.println("Enter 5 numbers for first array in ascending order:");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }

        // Take input for second array in ascending order
        System.out.println("Enter 5 numbers for second array in ascending order:");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }

        // Copy first array into merged array
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy second array into merged array
        for (int i = 0; i < array2.length; i++) {
            mergedArray[i + array1.length] = array2[i];
        }

        // Display merged array
        System.out.println("Merged Array:");

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        // Assume first element is the largest
        int largest = mergedArray[0];

        // Find the largest element
        for (int i = 1; i < mergedArray.length; i++) {

            if (mergedArray[i] > largest) {
                largest = mergedArray[i];
            }
        }

        // Display the largest element
        System.out.println("\nLargest Element: " + largest);

        input.close();
    }
}
