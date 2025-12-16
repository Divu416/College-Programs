// Write a program to accept 10 numbers in an array and find total of positive and negative no.
import java.util.Scanner;

public class Nagative_Positive {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Array Size : ");
    int size =scan.nextInt();

    System.out.print("----Enter Array Elements----");
    int positive = 0;
    int nagative = 0;
    int[] arr = new int[size];
    for(int i=0;i<size;i++)
    {
      System.out.printf("\n %d Elements : ",i + 1);
      arr[i] = scan.nextInt();
      if(arr[i] % 2 == 0)
      {
        positive++;
      }

      else
      {
        nagative++;
      }
    }

    System.out.printf("\n Positives : %d",positive);
    System.out.printf("\n Nagatives : %d",nagative);

    scan.close();
  }
}
