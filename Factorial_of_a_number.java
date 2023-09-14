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

        

        // Adding Scanner Function 

 

        Scanner input = new Scanner(System.in);

 

        int input_number = input.nextInt();

 

        // Adding factorial function

 

        if(input_number < 0){

            System.out.println("Error");

        }else{

            long factorial = 1;

            for( int i = 1; i <= input_number; i++){

                factorial *= i;

            }

 

            System.out.println(factorial);

        }

        

    }

}

 
