import java.util.Scanner;
public class PigLatinTranslator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter one or more words that you would like to translate to Pig Latin: ");
        final String userInput = scnr.nextLine();
        scnr.close();

        String[] word = userInput.split(" "); 
        String output = "";

        for (int i = 0; i < word.length; i++) {
            String pigLatinWord = translateWord(word[i]); 
            output += pigLatinWord + " "; 
        }

        System.out.println("Original Word(s): " + userInput);
        System.out.println("Translation: " + output + "\n");
    }

    public static String translateWord(String word) {
        String lowerCaseWord = word.toLowerCase();
        int pos = -1; 
        char ch;

        
        for (int i = 0; i < lowerCaseWord.length(); i++) {
            ch = lowerCaseWord.charAt(i);

            if (isVowel(ch)) {
                pos = i;
                break;
            }
        }

        if (pos == 0) {
            
            return lowerCaseWord + "yay"; 
        } else {
            
            String a = lowerCaseWord.substring(pos); 
            String b = lowerCaseWord.substring(0, pos); 
            return a + b + "ay"; 
        }
    }

    
    public static Boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            return true;
        }
        return false;
	}

}
