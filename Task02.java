
public class Task02 {
    public static void main(String[] args) {

        // // Declare an array of 10 integers
        int[] arr = { 10, 5, 20, 3, 8, 2 };

        // intialize maximum and minimum with the first array element
        int max = arr[0];
        int min = arr[0];

        // intialize second minimum with the maximum possible integer value
        int secondMin = Integer.MAX_VALUE;

        // store the indexes of maximum,minimum nd second minimum
        int maxIndex = 0;
        int minIndex = 0;
        int secondMinIndex = -1;

        // traverse the array starting from the second element
        for (int i = 1; i < arr.length; i++) {

            // check if the current element is greater than maximum
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }

            // check if the current element is smaller than minimum
            if (arr[i] < min) {

                // update second minimum with the previous minimum
                secondMin = min;
                secondMinIndex = minIndex;

                // update the new minimum value nd its index
                min = arr[i];
                minIndex = i;

                // check if the current element is smaller than minimum
                // nd smaller than second
            } else if (arr[i] > min && arr[i] < secondMin) {

                // update second minimum nd its index
                secondMin = arr[i];
                secondMinIndex = i;
            }
        }

        // display the maximum value nd its index
        System.out.println("Maximum: " + max);
        System.out.println("Maximum Index: " + maxIndex);

        // display the minimum value nd its index
        System.out.println("Minimum: " + min);
        System.out.println("Minimum Index: " + minIndex);

        // display the second minimum value and its index
        System.out.println("Second Minimum: " + secondMin);
        System.out.println("Second Minimum Index: " + secondMinIndex);
    }
}
