/*
Write a program to find x to the power n (i.e., x^n). Take x and n from the user. You need to print the answer.
Note: For this question, you can assume that 0 raised to the power of 0 is 1
*/

import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		long power=1;
		while(0<n){
			power = power*x;
			n--;
		}

		System.out.print(power);
	}
}
