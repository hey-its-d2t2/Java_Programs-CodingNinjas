/*Design a class called Rectangle.
It contains two data members as length(L) and breadth(B); 
and a member function getArea(). 
The member function computes the area of the given rectangle and returns it to the caller.*/
import java.util.* ;
import java.io.*; 
public class Rectangle { 
    // Write your code here.
    int length;
	int breadth;

	public int getArea() {
		int area = length * breadth;
		return area;
	}
}
