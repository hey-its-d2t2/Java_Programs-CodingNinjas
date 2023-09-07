/*
Create a class GrandFather that has a parameterized constructor and a grandFatherName attribute.
Create another class Father that inherits the property of GrandFather and has a parameterized constructor with an additional argument fatherName.
Create another class Son that inherits Father's property and has a parameterized constructor with an additional argument sonName and a 
printName method that prints the sonName,fatherName, and grandFatherName into the format as shown below in SampleOutput 1.
You need to create the object of Son class and pass the value of sonName,fatherName,grandFatherName as 'Saurabh', 'Ramesh', and 'Suresh' respectively and call the printName method.
*/
import java.util.* ;
import java.io.*; 

// Create the classes here
class GrandFather {

	String grandFatherName;
	public GrandFather(String grandFatherName)
	{
		this.grandFatherName = grandFatherName;
	}
}
class Father extends GrandFather
{
	String fatherName;
	Father(String fatherName, String grandFatherName)
	{
		super(grandFatherName);
		this.fatherName = fatherName;
	}

}
class Son extends Father
{
	String sonName;
	Son(String sonName, String fatherName, String grandFatherName)
	{
		super(fatherName,grandFatherName);
		this.sonName = sonName;
	}
	public void printName()
	{
		System.out.println("sonname: "+this.sonName);
		System.out.println("fathername: "+this.fatherName);
		System.out.println("grandfather: "+this.grandFatherName);
	}
}
class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		Son s1 = new Son("Saurabh", "Ramesh", "Suresh");
		s1.printName();

	}
}
