// Write a program to delete a particular character from the giving string.

public class Deleting_char_string{
    public static void main(String[] args) {
        String str = "Hello World!\n";



        String strN = str.replace("l", "");

        System.out.print("Old String : " + str);
        System.out.print("Dleted Charecter String : " + strN); 
    }
}