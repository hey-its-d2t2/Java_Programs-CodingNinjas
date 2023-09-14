/*
Write a program to find the factorial of a number.
Factorial of n is:
n! = n * (n-1) * (n-2) * (n-3)....* 1
Output the factorial of 'n'. If it does not exist, output 'Error'.
*/
import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		long fact =1;

		for(int i=1;i<=num;i++)
		{
			if(num==0 || num==1)
				break;
			fact =fact*i;
		}
		System.out.print(fact);
		
	}
}
