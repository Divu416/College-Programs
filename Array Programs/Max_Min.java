// Write a program to accept 5 numbers an array and find maximum and minimum value of it.

import java.util.Scanner;
public class Max_Min {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Array Size : ");
    int size = scan.nextInt();

    int[] arr = new int[size];
    int min = arr[0];
    int max = arr[0];


    System.out.print("-----Enter Array Elements-----\n");
    for(int i=0;i<size;i++)
    {
      System.out.printf("\n %d Element : ",i + 1);
      arr[i] = scan.nextInt();
    }

    for(int j=0;j<size;j++)
    {
      if(min > arr[0]) {
      if(arr[j] < min)
      {
        min = arr[j];
      }
    }
      
      if(arr[j] > max)
      {
        max = arr[j];
      }
    }

    System.out.printf("\n %d Is Min Value.....",min);
    System.out.printf("\n %d Is Max Value.....",max);
  }

}
