// Write a program to count no. of words in a sentence.

import java.util.Scanner;

public class Count_word {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Sentence : ");
        String str = scan.nextLine();

        System.out.print("\nYoure Sentence is : " + str);

        System.out.printf("\n %d Words in The String....",count(str));



    }

            public static int count(String str)
        {
            String trimdStr = str.trim();

            if(trimdStr.isEmpty())
            {
                return 0;
            }

            String[] words = trimdStr.split("\\s+");

            return words.length;
        }

}
