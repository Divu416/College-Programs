// Write a program to accept 5 numbers in an array and calculate average of it
import java.util.Scanner;

public class Array_average {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("----Enter Array Elements----\n");
    int size = scan.nextInt();
    int[] arr = new int[size];
    int sum = 0;
    System.out.print("\n-----Enter Array Elements-----\n");
    for(int i=0;i<arr.lenth;i++)
    {
      System.out.printf("\n %d Element : ",i + 1);
      arr[i] = scan.nextInt();
      sum += arr[i];
    }

    System.out.print
  }  
}
