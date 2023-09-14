/*
Given three values - Start Fahrenheit Value  (S), End Fahrenheit value (E), and Step Size (W),
you need to convert all Fahrenheit values from Start to End at the gap of W into their corresponding Celsius values and print the table.
*/

import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		int end = sc.nextInt();
		int gap = sc.nextInt();

		float inCelsius =0;
		
		for(int i =start; i<=end;i+=gap)
		{
			inCelsius = ((i - 32.0f)*5)/9 ; 
			if(inCelsius>=0)  
			    System.out.println(i + "\t"+ (int)Math.floor(inCelsius));  
			else 
			    System.out.println(i + "\t"+ (int)Math.ceil(inCelsius));	
		}
		
	}
}
