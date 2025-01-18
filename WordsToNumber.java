import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class WordsToNumber {

    // Mapping of words to their numeric values
    private static final Map<String, Integer> numberMap = new HashMap<>();
    private static final Map<String, Integer> multiplierMap = new HashMap<>();

    static {
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);
        numberMap.put("ten", 10);
        numberMap.put("eleven", 11);
        numberMap.put("twelve", 12);
        numberMap.put("thirteen", 13);
        numberMap.put("fourteen", 14);
        numberMap.put("fifteen", 15);
        numberMap.put("sixteen", 16);
        numberMap.put("seventeen", 17);
        numberMap.put("eighteen", 18);
        numberMap.put("nineteen", 19);
        numberMap.put("twenty", 20);
        numberMap.put("thirty", 30);
        numberMap.put("forty", 40);
        numberMap.put("fifty", 50);
        numberMap.put("sixty", 60);
        numberMap.put("seventy", 70);
        numberMap.put("eighty", 80);
        numberMap.put("ninety", 90);

        multiplierMap.put("hundred", 100);
        multiplierMap.put("thousand", 1000);
        multiplierMap.put("lakh", 1_00_000);
        multiplierMap.put("crore", 10_000_000);
        multiplierMap.put("million", 1_000_000);
        multiplierMap.put("billion", 1_000_000_000);
    }

    public static int convertWordsToNumber(String input) {
        String[] words = input.toLowerCase().split("\\s+");
        int total = 0;
        int current = 0;

        for (String word : words) {
            if (numberMap.containsKey(word)) {
                current += numberMap.get(word);
            } else if (multiplierMap.containsKey(word)) {
                current *= multiplierMap.get(word);
                if (word.equals("thousand") ||word.equals("lakh")||word.equals("crore")||word.equals("million") || word.equals("billion")) {
                    total += current;
                    current = 0;
                }
            }
        }
        total += current; // Add the last accumulated value
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number in words (e.g., 'one hundred twenty three'):");
        String input = scanner.nextLine();

        int result = convertWordsToNumber(input);
        System.out.println("The number is: " + result);
    }
}