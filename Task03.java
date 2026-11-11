
public class Task03 {
    public static void main(String[] args) {

        // creating Array
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        int length = arr.length;

        // Loop For All Elements
        for (int i = 0; i < length; i++) {
            sum = sum + arr[i];
        }

        // for calculating average
        double average = (double) sum / length;
         
        int count = 0;

        // using loop for camparing average
        for (int i = 0; i < length; i++) {

            if (arr[i] > average) {
                count++;
            }
        }

        // for final result
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Elements greater than average = " + count);
    }
}

