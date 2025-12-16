// Write a program to accept 10 numbers in an array. Sort it and display it.
import java.util.Arrays;
import java.util.Scanner;

public class Array_sort{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Array Lenth : ");
    int size = scan.nextInt();
    int[] arr = new int[size];

    System.out.print("\n-----Enter Array Elements-----\n\n");

    for(int i=0;i<size;i++)
    {
      System.out.printf("\n%d Element : ",i+1);
      arr[i] = scan.nextInt();
    }

    Arrays.sort(arr);

    System.out.println("Sorted Array is : " + Arrays.toString(arr));
  }

  scan.close();
}