// Write a program to sort all the element of 1-D array in descending order

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Array_disc {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Array Elements : ");
    int size =  scan.nextInt();
    Integer[] arr = new Integer[size];
    System.out.print("----Enter Array Element----");
    for(int i=0;i<size;i++)
    {
      System.out.printf("\n %d Element : ",i+1);
      arr[i] = scan.nextInt();
    }

    System.out.print("Before Sorting : " + Arrays.toString(arr));

    Arrays.sort(arr, Collections.reverseOrder());

    System.out.print("\n After Sorting : " + Arrays.toString(arr));
  }

 
}
