/* You are given a string ‘S’ of lowercase English alphabets, 
you are required to print ‘S’ 5 times, each on a new line using a while loop.*/

import java.util.* ;
import java.io.*; 

public class Solution {
    static void printName(String s){
        // Write your code here.
        int t=1;
        while(t<=5)
        {
            System.out.println(s);
            t++;
        }
    }
}
