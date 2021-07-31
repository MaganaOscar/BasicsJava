import java.util.Arrays;
public class TestBasicJava {
    public static void main(String[] args) {
        BasicJava tester = new BasicJava();

        // tester.print255();
        // tester.print255Odd();
        // System.out.println(tester.sigma255());
        int[] oddArray = {1, 3, 5, 7, 9, 13};
        // tester.iterArray(oddArray);
        int[] negativeArray = {-3, -5, -7};
        int[] mixedArray = {0, -10, 5, 2};
        // tester.max(oddArray); //13
        // tester.max(negativeArray); //-3
        // tester.max(mixedArray); //5
        // tester.oddArray255();
        // int[] avgArray = {2, 10, 3};
        // tester.getAverage(avgArray);
        // int[] greaterThanY = {1, 3, 5, 7};
        // System.out.println(tester.greaterThanY(greaterThanY, 3));
        // int[] squareArr = {1, 5, 10, -2};
        // tester.squareValues(squareArr);
        // int[] elimArr = {1, 5, 10, -2};
        // tester.eliminateNegativeNums(elimArr);
        int[] maxMinAvgArr = {1, 5, 10, -2};
        // System.out.println(Arrays.toString(tester.maxMinAvg(maxMinAvgArr)));
        int[] shiftArr = {1, 5, 10, 7, -2};
        // tester.shiftArr(shiftArr);
    }
}