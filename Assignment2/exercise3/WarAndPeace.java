package ww222ag_assign2.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;





public class WarAndPeace {        	
            public static void main(String[] args) {
                String text = readText("D:/JAVA/WarAndPeace.txt");   // My own method
                String[] words = text.split(" ");  // Simple split, will be cleaned up later on
                System.out.println("Initial word count: " + words.length);   // We found 577091

                Stream<String> stream = Arrays.stream(words);
                var count = stream.map(word -> word.toLowerCase().replaceAll("[^a-z-']", ""))
                		        // Convert to lowerCase replace other characters
                                
                        .filter(word -> !word.isEmpty())
                        .distinct() // get distinct
                        .count();

                System.out.printf("Unique words count: %d\n", count);
            }

            private static String readText(String path) {
                try {
                    return Files.readAllLines(Paths.get(path)).toString();
                } catch (IOException e) {
                    System.err.printf("failed to read text, message: %s", e.getMessage());
                    return "";
                }
            }
        }