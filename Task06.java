import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare an array of 10 integers
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.print("Enter index to delete (0-9): ");
        int index = input.nextInt();

        // Check whether the entered index is valid
        if (index < 0 || index >= numbers.length) {
            System.out.println("Invalid index!");
        } 
        else {

            // Shift elements one postion to the left
            for (int i = index; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }

            // Display the updated array
            System.out.println("Array after deleting element:");

            for (int i = 0; i < numbers.length - 1; i++) {
                System.out.print(numbers[i] + " ");
            }
        }

        input.close();
    }
}

