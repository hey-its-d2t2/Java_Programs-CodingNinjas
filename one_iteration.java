/*
Alice loves to give challenging tasks to Bob. This time, 
Alice gave Bob an array ‘A’ of ‘N’ distinct integers and asked him to find the maximum sum Bob can make by taking two elements from this array. 
To make this challenging, Alice asked Bob to find the answer by traversing the array only once.

As always, Bob asked you to help him do the task by traversing the array only once.
*/

import java.util.* ;
import java.io.*; 
public class Solution {

    public static int oneIteration(int[] A) {
        
        // WRite your Code here
        Arrays.sort(A);
        return A[A.length-1]+A[A.length-2];
    }
}
