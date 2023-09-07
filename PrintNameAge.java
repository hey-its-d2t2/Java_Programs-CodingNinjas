/*The task is to print the Name and Age entered by the user*/
import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		System.out.print("My name is "+name+" and my age is "+age+".");
		
	}
}
