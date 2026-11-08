import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        // input 10 numbers
        System.out.println("enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ":");
            numbers[i] = input.nextInt();
        }
        // DISPLAY ARRAY ELEMENTS
        System.out.println("\nARRAY ELEMENST:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + "");
        }
        // Display elements in reverse order
        System.out.println("\n\nArray in reverse order :");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + "");
        }
        input.close();

    }
}