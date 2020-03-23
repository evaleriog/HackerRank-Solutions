//Given a time in -hour AM/PM format, convert it to military (24-hour) time.
//        Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
//        Function Description
//        Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.
//        timeConversion has the following parameter(s):
//        s: a string representing time in  hour format
//        Input Format
//        A single string  containing a time in -hour clock format (i.e.:  or ), where  and .
//        Constraints
//        All input times are valid
//        Output Format
//        Convert and print the given time in -hour format, where .
//        Sample Input 0
//        07:05:45PM
//        Sample Output 0
//        19:05:45

package ProblemSolving.WarmUp;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] time = s.split(":");

        int hour = Integer.parseInt(time[0]);
        String zone = time[2].substring(time[2].length() - 2,time[2].length());

        if(hour < 12 && zone.equals("PM")){
            time[0] = Integer.toString(Integer.parseInt(time[0]) + 12);
        }else if(hour == 12 && zone.equals("AM")){
            time[0] = "00";
        }

        time[2] = time[2].substring(0,2);

        String result = String.join(":", time);

        return result;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
