import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava {
    public void print255() {
        for(int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }
    public void print255Odd() {
        for(int i = 1; i <= 255; i = i + 2) {
            System.out.println(i);
        }
    }
    public int sigma255() {
        int sum = 0;
        for(int i = 1; i <= 255; i++) {
            sum += i;
        }

        return sum;
    }
    public void iterArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
    public int max(int[] arr) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // System.out.println(max);
        return max;
    }
    public void oddArray255() {
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i = i + 2) {
            oddArray.add(i);
        }
        System.out.println(oddArray);
    }
    public int getAverage(int[] arr) {
        int average;
        int sum = 0;
        for (int num: arr) {
            sum += num;
        }
        average = sum / arr.length;
        // System.out.println(average);
        return average;
    }
    public int greaterThanY(int[] arr, int y) {
        int greaterThanY = 0;
        for(int num : arr) {
            if (num > y) {
                greaterThanY++;
            }
        }
        return greaterThanY;
    }
    public void squareValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public void eliminateNegativeNums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public int[] maxMinAvg(int[] arr) {
        int min = arr[0];
        int max = max(arr);
        int avg = getAverage(arr);
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        int[] results = {max, min, avg};
        return results;
    }
    public void shiftArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if( i + 1 != arr.length) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}