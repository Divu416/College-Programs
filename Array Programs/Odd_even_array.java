
// Write a program to find number of odd and even elements from 1-D array.
import java.util.Arrays;
import java.util.Scanner;

public class Odd_even_array {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Eneter Array Size : ");
    int size = scan.nextInt();

    int[] arr = new int[size];
    int odd = 0;
    int even = 0;

    System.out.print("\n-----Enter Array Elements-----\n");
    for (int i = 0; i < size; i++) {
      System.out.printf("\n %d Elements : ", i + 1);
      arr[i] = scan.nextInt();
      if(arr[i] % 2 == 0)
      {
        even++;
      }

      if(arr[i] % 2 != 0)
      {
        odd++;
      }
    }

    System.out.print("\nArray Elements : " + Arrays.toString(arr));

    System.out.printf("\nOdd Numbers : %d",odd);
    System.out.printf("\nEven Numbers : %d",even);

    System.out.print("\nEvene Numbers : ");
    for (int i = 0; i < size; i++) {
      if (arr[i] % 2 == 0) {
        System.out.print(arr[i] + " ");
      }
    }


        System.out.print("\nOdd Numbers : ");
    for (int i = 0; i < size; i++) {
      if (arr[i] % 2 != 0) {
        System.out.print(arr[i] + ",");
      }
    }

  }
}
