package sort;

import java.util.Arrays;

/**
 * Selection sort - have to find or select the min number in each iteration.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 3, 14, 1, 54};
        for (int firstUnsortedIndex = 0; firstUnsortedIndex < numbers.length; firstUnsortedIndex++) {
            int minIndex = firstUnsortedIndex;
            for (int j = firstUnsortedIndex; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            swap(numbers, firstUnsortedIndex, minIndex);
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void swap(int[] numbers, int firstUnsortedIndex, int minIndex) {
        int temp = numbers[firstUnsortedIndex];
        numbers[firstUnsortedIndex] = numbers[minIndex];
        numbers[minIndex] = temp;
    }
}
