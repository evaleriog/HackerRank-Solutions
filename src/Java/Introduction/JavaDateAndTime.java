//The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
//        You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
//        For example, if you are given the date , the method should return  as the day on that date.
//        image
//        Input Format
//        A single line of input containing the space separated month, day and year, respectively, in    format.
//        Constraints
//
//        Output Format
//        Output the correct day in capital letters.
//        Sample Input
//        08 05 2015
//        Sample Output
//        WEDNESDAY
//        Explanation
//        The day on August th  was WEDNESDAY.

package Introduction;

import java.util.Calendar;

public class JavaDateAndTime {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String[] days = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);

        int weekDay = cal.get(Calendar.DAY_OF_WEEK);

        return days[weekDay].toUpperCase();

    }
}
