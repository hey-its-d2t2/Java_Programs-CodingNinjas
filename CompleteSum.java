/*
Ninja has an array ‘A’ of size ‘N’. He recently created a topic ‘Complete Sum’ and defined the term ‘completeSum[i]’ = Sum ( A[0] … A[i] ).

Output the complete sum array of array ‘A’.
*/
import java.util.* ;
import java.io.*; 

class Solution {

  public static int[] completeSum(int a[], int n) {
    // Write your code here.
    n = a[0];
    for(int i=1;i<a.length;i++)
    {
      a[i] = n + a[i];
      n= a[i];
    }
    return a;
  }
}
