/*
Write a program to input an integer N and print the sum of all its even digits and all its odd digits separately.

Digits mean numbers, not the places! If the given integer is "13245",  even digits are 2 & 4, and odd digits are 1, 3 & 5.
*/
import java.util.Scanner;

class Solution {

    

    public static void main(String args[]) {

        

        Scanner sc=new Scanner(System.in);

        long temp=sc.nextLong();

 

        long sumOdd=0, sumEven=0;

        long n=temp;

        while(n!=0)

        {

            

            long rem=(n%10);

            if(rem%2==0)

            {

                sumEven+=rem;

            }

            else

            {

                sumOdd+=rem;

            }

            n=n/10;

 

        }

        System.out.println(sumEven+" "+sumOdd);

        

    }

}

