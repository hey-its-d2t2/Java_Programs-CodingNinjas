/*You are given a string 'S'. 
Your task is to check whether the string is palindrome or not. 
For checking palindrome, consider alphabets and numbers only and ignore the symbols and whitespaces.*/
import java.util.* ;
import java.io.*; 
public class Solution {

	public static boolean checkPalindrome(String str) {
		 String result = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		return twoPointer(0, result.length()-1,result);
	}

	public static boolean twoPointer(int start,int end,String str){
		if(start>end)
		return true;
		return (str.charAt(start)==str.charAt(end)) && twoPointer(start+1, end-1, str);
	}
}
