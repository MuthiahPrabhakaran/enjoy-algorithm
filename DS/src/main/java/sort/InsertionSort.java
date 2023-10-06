package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 3, 14, 1, 54};
        for(int i = 1; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int j = i-1;
            while(j >= 0 && currentNumber < numbers[j]) {
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = currentNumber;
        }
        System.out.println(Arrays.toString(numbers));
    }
}



