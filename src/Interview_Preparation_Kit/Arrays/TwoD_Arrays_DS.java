//Given a  2D Array, :
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//        We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:
//        a b c
//        d
//        e f g
//        There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
//        For example, given the 2D array:
//        -9 -9 -9  1 1 1
//        0 -9  0  4 3 2
//        -9 -9 -9  1 2 3
//        0  0  8  6 6 0
//        0  0  0 -2 0 0
//        0  0  1  2 4 0
//        We calculate the following  hourglass values:
//        -63, -34, -9, 12,
//        -10, 0, 28, 23,
//        -27, -11, -2, 10,
//        9, 17, 25, 18
//        Our highest hourglass value is  from the hourglass:
//        0 4 3
//        1
//        8 6 6
//        Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.
//        Function Description
//        Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the array.
//        hourglassSum has the following parameter(s):
//        arr: an array of integers
//        Input Format
//        Each of the  lines of inputs  contains  space-separated integers .
//        Constraints
//
//
//        Output Format
//        Print the largest (maximum) hourglass sum found in .
//        Sample Input
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0
//        Sample Output
//        19
//        Explanation
//        contains the following hourglasses:
//        image
//        The hourglass with the maximum sum () is:
//        2 4 4
//        2
//        1 2 4

package Interview_Preparation_Kit.Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoD_Arrays_DS {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        // int max = 1;
        // for(int i = 0; i <= arr.length / 2; i++){
        //     for(int j = 0; j <= arr.length / 2; j++){
        //         int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

        //         if(sum > max){
        //             max = sum;
        //         }
        //     }
        // }

        int max = Integer.MIN_VALUE;
        int sum;

        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                sum = arr[i + 1][j + 1];
                for(int k = j; k < j + 3; k++){
                    sum += arr[i][k] + arr[i + 2][k];
                }
                if(sum > max)
                    max = sum;
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
