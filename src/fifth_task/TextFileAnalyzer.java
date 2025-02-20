package fifth_task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileAnalyzer {
    public static void TextAnalyzerInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write of file name: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s+").length;
            }

            System.out.println("Count of line: " + lineCount);
            System.out.println("Count of word: " + wordCount);
            System.out.println("Count of char: " + charCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.: " + e.getMessage());
        }


        System.out.print("Enter the word you want to search for.:");
        String searchWord = scanner.nextLine();
        int searchCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        searchCount++;
                    }
                }
            }

            System.out.println("'" + searchWord + "' word " + searchCount + " times found.");

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

    }
}
