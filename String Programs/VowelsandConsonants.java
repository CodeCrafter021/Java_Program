import java.util.Scanner;

// Program to count vowels and consonants in a string
public class VowelsandConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowels = 0, consonants = 0;
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Check each character
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            
            // Only count letters, skip spaces and numbers
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++; // It's a vowel
                } else {
                    consonants++; // It's a consonant
                }
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
