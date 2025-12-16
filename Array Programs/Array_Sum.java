// Write a program to accept 10 value in a 1-D array and print the sum of all the element.

import java.util.Scanner;
public class Array_Sum {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Array Element Size : ");
    int size = scan.nextInt();

    int[] arr =new int[size];
    int sum = 0;

    System.out.print("\n------Enter Array Elements-------\n");

    for(int i=0;i<arr.length;i++)
    {
      System.out.printf("\n %d Element : ",i + 1);
      arr[i] = scan.nextInt();
     sum += arr[i]; 
    }

    System.out.printf("\n %d Is Sum Of Elements ",sum);
  }
  
}
