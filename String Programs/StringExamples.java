import java.util.Arrays;

public class StringExamples {
    public static void main(String[] args) {
        String value = "Java programming";
        System.out.println("Character: " + value.charAt(2));
        System.out.println("Replace at index: " + value.substring(0, 2) + 'X' + value.substring(3));
        System.out.println("Reverse: " + new StringBuilder(value).reverse());
        char[] sorted = value.replace(" ", "").toCharArray();
        Arrays.sort(sorted);
        System.out.println("Sorted: " + new String(sorted));
        System.out.println("Pair swap: " + swapPairs("abcdef"));
        System.out.println("Pangram: " + isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println("First letters: " + value.replaceAll("(?i)(^|\\s)([a-z]).*?", "$2"));
        System.out.println("Code point: " + value.codePointAt(2));
        System.out.println("No leading zeros: " + "000420".replaceFirst("^0+(?!$)", ""));
        System.out.println("Lexicographic compare: " + "alpha".compareTo("beta"));
        System.out.println("Even words: " + Arrays.stream(value.split(" ")).filter(word -> word.length() % 2 == 0).toList());
        System.out.println("Insert: " + new StringBuilder(value).insert(5, " basic").toString());
        System.out.println("Split: " + Arrays.toString(value.split(" ")));
    }

    private static String swapPairs(String value) {
        StringBuilder result = new StringBuilder(value);
        for (int index = 0; index + 1 < result.length(); index += 2) {
            char first = result.charAt(index);
            result.setCharAt(index, result.charAt(index + 1));
            result.setCharAt(index + 1, first);
        }
        return result.toString();
    }

    private static boolean isPangram(String value) {
        return value.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26;
    }
}