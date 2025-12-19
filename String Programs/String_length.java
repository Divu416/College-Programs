// Write a program to find the length of a string.

import java.util.Scanner;

public class String_length{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = scan.nextLine();

        System.out.print("String is : " + str);

        int size = str.length();

        System.out.print("\n String Size is : " + size);
    }
}