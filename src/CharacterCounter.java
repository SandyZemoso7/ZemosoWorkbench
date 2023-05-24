import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the file name as a command line argument.");
            return;
        }

        String fileName = args[0];

        try {
            String fileContent = new String(Files.readAllBytes(Paths.get(fileName)));

            Map<Character, Integer> characterCountMap = countCharacters(fileContent);

            saveCharacterCounts(characterCountMap);
            System.out.println("Character counts saved to 'character_counts.txt'");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    private static Map<Character, Integer> countCharacters(String text) {
        Map<Character, Integer> characterCountMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
        }

        return characterCountMap;
    }

    private static void saveCharacterCounts(Map<Character, Integer> characterCountMap) {
        try (FileWriter writer = new FileWriter("character_counts.txt")) {
            for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while saving the character counts: " + e.getMessage());
        }
    }
}