
/*
You have been given a number 'N'. Your task is to find the sum of all even numbers from 1 to 'N' (both inclusive).
Given 'N' : 6
Sum of all even numbers till 'N' will be : 2 + 4 + 6 = 12
*/
import java.util.* ;
import java.io.*; 
public class Solution {
	public static long evenSumTillN(int n) {
		// Write your code here.
		long sum=0;
		for(int i=2; i<=n;i+=2)
		{
			sum+=i;
		}
		return sum;
	}
}
