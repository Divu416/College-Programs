
// Write a program to replace a particular character by a character in the string
public class Change_char_string {

    public static void main(String[] args) {
        String str = "Hello World!\n";

        char oldChar = 'W';
        char newChar  = 'D';

        String new_Sentance = str.replace(oldChar, newChar);

        System.out.print("\nYoure String is : " + str);
        System.out.print("Replaced Character String is : " + new_Sentance);

    }
}
