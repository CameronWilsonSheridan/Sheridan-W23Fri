/*
    Ask a user to enter a word
    Store the word in a string
    Create a character array the same length as the word
    Store each character from the word in the character array
    print the character array in reverse
 */
package student_file;
import java.util.Scanner;

/**
 *
 * @author camwi
 */
public class ReverseWord {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String wordToReverse;
        
        System.out.print("Please enter a word to be reversed: ");
        wordToReverse = in.next();
        
        char[] charsToReverse = new char[wordToReverse.length()];
//        System.out.println(wordToReverse.length());

        for(int i = 0; i < charsToReverse.length; i++){
            charsToReverse[i] = wordToReverse.charAt(charsToReverse.length - i - 1);
        }
//        for(int i = 0; i < (int)(charsToReverse.length / 2); i++){
//            char tempChar = charsToReverse[i];
//            charsToReverse[i] = charsToReverse[charsToReverse.length - i - 1];
//            charsToReverse[charsToReverse.length - i - 1] = tempChar;
//        }
        
        System.out.println(charsToReverse);
    }
}
