// Write a program to accept 5 numbers in an array and calculate average of it
import java.util.Scanner;

public class Array_average {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Array Elements : ");
    int size = scan.nextInt();
    int[] arr = new int[size];
    int sum = 0;
    System.out.print("\n-----Enter Array Elements-----\n");
    for(int i=0;i<size;i++)
    {
      System.out.printf("\n %d Element : ",i + 1);
      arr[i] = scan.nextInt();
      sum += arr[i];
    }
    int avg = sum/size;
    System.out.printf("\n %d Is youre Sum....",sum);
    System.out.printf("\n %d Is youre Average....",avg);
  }  
}
