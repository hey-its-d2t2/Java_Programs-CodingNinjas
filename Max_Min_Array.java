import java.io.*;
import java.util.*;
class Example
  {
    public static void main(String[] args)
    {
      Scaner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
      int max= arr[0],min=arr[0];

      for(int i=0;i<arr.length;i++)
        {
          if(max < arr[i])
            max = arr[i];
          if(min > arr[i])
            min = arr[i];
        }
      System.out.print("Maximum value : "+max);
      System.out.print("Minimum value : "+min);
    }
  }