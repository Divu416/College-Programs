
//  Write a program to read value in two-dimensional array and print the maximum and minimum value.
import java.util.Scanner;

public class Raw_column {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Number of Raws : ");
    int raw = scan.nextInt();

    System.out.print("\nEnter Number of Columns : ");
    int col = scan.nextInt();

    int[][] arr = new int[raw][col];

    System.out.print("\n-----Enter Arry Elements-----\n");

    for (int i = 0; i < raw; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print("\n Enter Value at [" + i + "][" + j + "] : ");
        arr[i][j] = scan.nextInt();
      }
    }

    System.out.println("\nArray Elements:");
    for (int i = 0; i < raw; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println(); // move to next row
    }

    int min = arr[0][0];
    int max = arr[0][0];

    for (int i = 0; i < raw; i++) {
      for (int j = 0; j < col; j++) {
        if (arr[i][j] < min)
          min = arr[i][j];
        if (arr[i][j] > max)
          max = arr[i][j];
      }
    }

    System.out.println("Minimum value : " + min);
    System.out.println("Maximum value : " + max);
  }
}
