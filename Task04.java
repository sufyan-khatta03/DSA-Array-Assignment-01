import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // creating array
        int[] arr = {10, 20, 30, 20, 40, 20, 50};

        // taking inputs from user
        System.out.print("Enter number to search: ");
        int search = input.nextInt();

        // for counting
        int count = 0;

      // linear search for checking
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {

                // if numbers found then display
                System.out.println("Number found at index: " + i);

                //  Matches counting
                count++;
            }
        }
        // if number never found.
        if (count == 0) {
            System.out.println("Number not found in the array.");
        } else {
            System.out.println("Total occurrences: " + count);
        }

        input.close();
    }
}
    

