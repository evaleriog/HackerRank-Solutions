//HackerLand University has the following grading policy:
//        Every student receives a  in the inclusive range from  to .
//        Any  less than  is a failing grade.
//        Sam is a professor at the university and likes to round each student's  according to these rules:
//        If the difference between the  and the next multiple of  is less than , round up to the next multiple of .
//        If the value of  is less than , no rounding occurs as the result will still be a failing grade.
//        For example,  will be rounded to  but  will not be rounded because the rounding would result in a number that is less than .
//        Given the initial value of  for each of Sam's  students, write code to automate the rounding process.
//        Function Description
//        Complete the function gradingStudents in the editor below. It should return an integer array consisting of rounded grades.
//        gradingStudents has the following parameter(s):
//        grades: an array of integers representing grades before rounding
//        Input Format
//        The first line contains a single integer, , the number of students.
//        Each line  of the  subsequent lines contains a single integer, , denoting student 's grade.
//        Constraints
//
//
//        Output Format
//        For each , print the rounded grade on a new line.
//        Sample Input 0
//        4
//        73
//        67
//        38
//        33
//        Sample Output 0
//        75
//        67
//        40
//        33
//        Explanation 0
//        image
//        Student  received a , and the next multiple of  from  is . Since , the student's grade is rounded to .
//        Student  received a , and the next multiple of  from  is . Since , the grade will not be modified and the student's final grade is .
//        Student  received a , and the next multiple of  from  is . Since , the student's grade will be rounded to .
//        Student  received a grade below , so the grade will not be modified and the student's final grade is .

package ProblemSolving.Implementation;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> results = new ArrayList<>();

        for(int num: grades){
            if(num >= 38){
                String[] number = Integer.toString(num).split("");
                String partial = number[number.length - 1];
                int check = Integer.parseInt(partial);

                if(check > 0 && check <= 5){
                    if((5 - check) < 3){
                        check = 5;
                    }
                }else if(check > 5){
                    if((10 - check) < 3){
                        int decimal = Integer.parseInt(number[number.length - 2]);
                        number[number.length - 2] = String.valueOf(decimal + 1);
                        check = 0;
                    }
                }

                number[number.length - 1] = String.valueOf(check);
                results.add(Integer.parseInt(String.join("", number)));
            }else{
                results.add(num);
            }

        }

        return results;
    }

}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
