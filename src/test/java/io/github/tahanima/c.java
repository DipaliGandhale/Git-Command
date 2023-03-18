import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCounter {
    public static void main(String[] args) {
        String str = "Hello World!";
        Map<Character, Integer> charCountMap = countDuplicateCharacters(str);
        System.out.println("Duplicate character count:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public static Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }
        return charCountMap;
    }
}