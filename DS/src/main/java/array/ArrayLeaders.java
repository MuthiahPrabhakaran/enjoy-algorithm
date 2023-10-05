package array;

import java.util.*;

/**
 * <a href="https://www.enjoyalgorithms.com/blog/leaders-in-an-array/">leaders-in-an-array</a>
 * Given an integer array X[] of size n, write a program to find all the leaders in the array X[].
 * An element is a leader if it is strictly greater than all the elements to its right side.
 * Input: X[] = [16, 17, 4, 3, 5, 2], Output: [17, 5, 2]
 * Explanation: Element 2 is the rightmost element, so it is a leader by default.
 * 17 and 5 are also leader elements because they are greater than all the elements on their right side.
 */
public class ArrayLeaders {
    public static void main(String[] args) {
//        int[] numbers = {16, 17, 4, 3, 5, 2};
        int[] numbers = {16};
        int numbersLength = numbers.length;
        int currentLeader = numbers[numbersLength-1];
        LinkedList<Integer> leaders = new LinkedList<>();
        leaders.addLast(currentLeader);
        if(numbersLength > 2) {
            for(int i = numbersLength-2; i >= 0; i--) {
                int currentNumber = numbers[i];
                if(currentNumber > currentLeader) {
                    currentLeader = currentNumber;
                    leaders.addFirst(currentLeader);
                }
            }
        }
        System.out.println(leaders);
    }
}
