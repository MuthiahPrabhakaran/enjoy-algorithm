package array;

/**
 * <a href="https://www.enjoyalgorithms.com/blog/number-of-buildings-facing-sun/">number-of-buildings-facing-sun</a>
 * Given an input array height[] representing the heights of buildings,
 * write a program to count the number of buildings facing the sunset.
 * It is assumed that the heights of all buildings are distinct.
 * Input: height[] = [7, 4, 8, 2, 9],
 * Output: 3
 * Explanation: As 7 is the first element, it can see the sunset.
 * Similarly, 8 and 9 can see the sunset. 4 and 2 can't see the sunset because 7 and 8 are hiding it.
 */
public class BuildingCount {
    public static void main(String[] args) {
//        int[] heightsOfBuildings = {7, 4, 8, 2, 9};
//        int[] heightsOfBuildings = {2, 3, 4, 5};
        int[] heightsOfBuildings = {4, 4, 4, 4};
        int countOfBuildingFacingSun = 0;
        int currentMaxBuildingHeight = 0;
        for(int currentBuildingHeight : heightsOfBuildings) {
            if(currentBuildingHeight > currentMaxBuildingHeight) {
                countOfBuildingFacingSun++;
                currentMaxBuildingHeight = currentBuildingHeight;
            }

        }
        System.out.println("Count of buildings which are getting the sun light is " + countOfBuildingFacingSun);
    }
}
