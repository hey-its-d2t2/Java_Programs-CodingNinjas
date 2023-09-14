/*
Write a program to accept a coordinate point in an XY coordinate system and determine in which quadrant the coordinate point lies.
"1st Quadrant": if  +x,+y
"2nd Quadrant": if -x,+y
"3rd Quadrant": if -x,-y
"4th Quadrant": if +x,-y
"x axis": if x,0
"y axis": if 0,y
"Origin": if 0,0
*/
  

import java.util.* ;

import java.io.*; 

class Solution {

       public static void main(String args[]) {

        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();

        if(x>0&&y>0)
		{
           System.out.println("1st Quadrant");
        }
        else if(x<0&&y>0)
        {
            System.out.println("2nd Quadrant");
        }
        else if(x<0&&y<0)
        {
            System.out.println("3rd Quadrant");
        }
        else if(x>0&&y<0)
        {
            System.out.println("4th Quadrant");
        }
        else if(x>0&&y==0
		{
            System.out.println("x axis");
		}
        else if(x==0&&y>0)
		{
            System.out.println("y axis");   
        }
        else if(x==0&&y<0)
		{
            System.out.println("y axis");   
        }
        else if(x>0&&y==0)
		{
            System.out.println("y axis");   
        }
        else
		{
            System.out.println("at origin");
        }
	}
}
