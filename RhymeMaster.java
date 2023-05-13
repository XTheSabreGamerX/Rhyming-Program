/*Juan Carlos T. Matias
IT201A*/

import java.util.Scanner;
import java.util.regex.Matcher;     //Imports include: Scanner, Matcher, and Pattern!
import java.util.regex.Pattern;

public class RhymeMaster {
    
    private static String word1, word2, sub;    //Variables word1 and word2 needs to rhyme. Sub contains the last 2 letters of word1
    private static Pattern p;
    private static Matcher m;
    
    private static void matches() {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first word: ");     //Scanner questions for the two words
        word1 = s.nextLine();
        System.out.print("Enter the second word: ");
        word2 = s.nextLine();

        p = Pattern.compile("[a-zA-Z]{3,4}");   //Pattern containing: Upper or lower case A-Z and only up to 4 letters!
        sub = word1.substring(word1.length() - 2);  //sub containing last 2 letters of word1
        m = p.matcher(word2);   //Matcher to see if word2 matches with the pattern
    }
    
    public static void main(String[] args) {

    matches();  //matches method

        if (m.matches()) {  //Condition: If the matcher matches with word2
            if (sub.equalsIgnoreCase(word2.substring(word2.length() - 2))) {
                System.out.println("The last two letters you need to rhyme are: " + sub);
                System.out.println(word1 + " rhymes with " + word2 + "! Good Job!");
                System.exit(0);
            }
        }

        //Print Statement in case the two words do not match
        System.out.println("The last two letters you need to rhyme are: " + sub);
        System.out.println(word1 + " does not rhyme with " + word2 + "! Try Again!");

    }

}
