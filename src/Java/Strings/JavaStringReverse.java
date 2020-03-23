//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
//        Given a string , print Yes if it is a palindrome, print No otherwise.
//        Constraints
//        will consist at most  lower case english letters.
//        Sample Input
//        madam
//        Sample Output
//        Yes

package Strings;

import java.io.*;
import java.util.*;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        for(int x=0, y=A.length(); x<A.length(); x++, y--){
            if(!A.substring(x,x+1).equals(A.substring(y-1, y))){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
