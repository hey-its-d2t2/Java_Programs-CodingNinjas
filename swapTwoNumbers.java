/*You are given two numbers a and b. You must swap the values of 'a' and 'b'.*/
public class Solution{
    public static void swapNumber(int []a, int []b) {
        // Write your code here.
        a[0] = a[0] ^ b[0];
        b[0] = a[0] ^ b[0];
        a[0] = a[0] ^ b[0];

    }
}
