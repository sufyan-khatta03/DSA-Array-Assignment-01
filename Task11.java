import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare first and second arrays
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        // Declare third array to store merged elements
        int[] array3 = new int[10];

        // Take input for first sorted array
        System.out.println("Enter 5 numbers in ascending order for first array:");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextInt();
        }

        // Take input for second sorted array
        System.out.println("Enter 5 numbers in ascending order for second array:");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }

        // Initialize three index variables
        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements of both arrays
        while (i < array1.length && j < array2.length) {

            // Copy the smaller element into third array
            if (array1[i] <= array2[j]) {
                array3[k] = array1[i];
                i++;
            } else {
                array3[k] = array2[j];
                j++;
            }

            // Move to next position in third array
            k++;
        }

        // Copy remaining elements of first array
        while (i < array1.length) {
            array3[k] = array1[i];
            i++;
            k++;
        }

        // Copy remaining elements of second array
        while (j < array2.length) {
            array3[k] = array2[j];
            j++;
            k++;
        }

        // Display the merged sorted array
        System.out.println("Merged Array in Ascending Order:");

        for (int x = 0; x < array3.length; x++) {
            System.out.print(array3[x] + " ");
        }

        input.close();
    }
}
