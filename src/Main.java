import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 4};
        int target = 2;

        // Create a copy of the array and sort it
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        // Find the index of the target in the sorted array
        int index = Arrays.binarySearch(sortedArr, target);

        System.out.println("Output: [" + index + "]");
    }
}




/*You are given an array of integers and another target integer as input.
 Your task is to return the index of the target integer in the array as if it were sorted,
 Example:Input: [5, 6, 1, 2, 4], Target: 2 Output: [1]
Explanation: In the sorted version of the array [1, 2, 4, 5, 6], the target 2 appears at the index

*/
