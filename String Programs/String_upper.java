// Write a program to covert a string into upper case string.
import java.util.Scanner;

public class String_upper{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = scan.nextLine();
        String converted = str.toUpperCase();
        System.out.print("\n Upper case : " + converted);

    }
}
