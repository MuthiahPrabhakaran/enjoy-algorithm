package array;

/**
 * <a href="https://www.enjoyalgorithms.com/blog/valid-mountain-array/">valid-mountain-array</a>
 *
 */
public class ValidMountain {
    public static void main(String[] args) {
          int[] numbers = {1, 2, 6, 4, 3};
//        int[] numbers = {1, 2};
        System.out.println(isValidMount(numbers, numbers.length));
    }

    private static boolean isValidMount(int[] numbers, int length) {
        int climb = 0;
        while(climb < length - 1 && numbers[climb] < numbers[climb + 1])
            climb++;
        if(climb == length-1 || climb == 0)
            return false;
        while(climb < length - 1 && numbers[climb] > numbers[climb + 1])
            climb++;
        return climb == length - 1;
    }
}
