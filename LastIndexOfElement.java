/*
Take an array with N elements with possibly duplicate elements as the input. 
The task is to find the index of the last occurrences of the element x in the array and, if it is not present, return -1.
*/
import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
			arr[i] = sc.nextInt();
		int num = sc.nextInt();
		int k=-1;
		for(int i=0;i<n;i++){
			if(arr[i] == num)
				{
					k=i;
				}
		}
		System.out.print(k);
	}
}
