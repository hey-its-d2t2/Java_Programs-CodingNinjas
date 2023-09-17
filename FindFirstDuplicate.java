/*Take an array with n elements with possibly duplicate elements as the input. 
The task is to find the index of the first occurrences of the element x in the array and, if it is not present, return -1.*/
import java.util.Scanner;

class Solution 
{	
	public static void main(String args[])
  {
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
					break;
				}
		}
		System.out.print(k);
	}
}
