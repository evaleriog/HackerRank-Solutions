//In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
//        Use the power of Java's BigInteger class and solve this problem.
//        Input Format
//        There will be two lines containing two numbers,  and .
//        Constraints
//        and  are non-negative integers and can have maximum  digits.
//        Output Format
//        Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.
//        Sample Input
//        1234
//        20
//        Sample Output
//        1254
//        24680
//        Explanation

package BigNumber;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        // long n = in.nextLong();
        // long n2 = in. nextLong();

        // BigInteger num1 = BigInteger.valueOf(in.nextLong());
        // BigInteger num2 = BigInteger.valueOf(in.nextLong());

        BigInteger num1 = new BigInteger(in.next());
        BigInteger num2 = new BigInteger(in.next());


        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}
