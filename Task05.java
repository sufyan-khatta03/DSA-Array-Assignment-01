import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // creating array
        int[] arr = {10, 20, 30, 40, 50};

        // array current size
        int size = arr.length;

        // creating array with one extra space
        int[] newArr = new int[size + 1];

        // Using insertion  index
        System.out.print("Enter index where you want to insert: ");
        int index = input.nextInt();

        // taking new number from user
        System.out.print("Enter number to insert: ");
        int number = input.nextInt();

        // checked is index valid or not
        if (index < 0 || index > size) {

            System.out.println("Invalid index!");

        } else { 

            // copied index before the insertion index
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }

            // 9. New number ko given index par insert kiya
            // inserted the new number at the given index
            newArr[index] = number;

            // shifted the remaining elements to the right
            for (int i = index; i < size; i++) {
                newArr[i + 1] = arr[i];
            }

            // dispaly updated array
            System.out.println("Updated Array:");

            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
        
        }

        input.close();
    }
}

