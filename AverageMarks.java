/*You are given the name of a student in the form of a character ‘firstLetterOfName’ and 3 integers ‘M1’, ‘M2’, ‘M3’ representing the marks of the student in 3 subjects. 
You have to print the ‘firstLetterOfName’ of the student and the average marks obtained by the student.

Note: You need to print the integer part of the average only and neglect the decimal part.
*/
import java.util.* ;
import java.io.*; 
/*******************************************
 *
 *   Following is the Pair class structure
 *
 *   class Pair{
 *
 *       char firstLetterOfName;
 *       int avgMarks;
 *
 *       Pair(char firstLetterOfName, int avgMarks){
 *           this.firstLetterOfName = firstLetterOfName;
 *           this.avgMarks = avgMarks;
 *       }
 *   } 
 *
 **********************************************/


public class Solution {
	public static Pair averageMarks(char firstLetterOfName, int m1, int m2, int m3) {
		// Write your code here.
		int avg = (m1+m2+m3)/3;
		Pair p = new Pair(firstLetterOfName,avg);
		return p;
	}
}


