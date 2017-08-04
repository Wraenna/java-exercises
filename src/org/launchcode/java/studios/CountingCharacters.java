package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        /*
        Studio 2: Counting Characters, Java Edition
        -------------------------------------------

        This class takes in a string (for our purposes,
        this string will be hard-coded) and will print
        to the console a list of each character and
        how many times that character appears in the
        string.

        Requirements:
        Count can be case-sensitive to start.
        Must use a data structure of some kind.
        Must iterate over the string (use a for loop).
        Can count non-alphabetic characters to start.
         */

        // TODO: Define the test string.

        String test_string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        // TODO: Define a HashMap that will store String and Integer

        HashMap<Character, Integer> char_count = new HashMap<>();

        // TODO: Turn the string into a character array.

        char[] str_chars = test_string.toCharArray();

        /* TODO: For each character in the array, check to see if the key already exists.
           TODO: If the key exists, increment the key by 1.
           TODO: If the key does not exist, create a new key and set value to 1.
           TODO: Print the results to the console in the following format:
           TODO: "[character]: [count] /n"
         */
        // For each character in the array
        for (char character : str_chars) {
            // If the character is not found
            if (!char_count.containsKey(character)) {
                // Create a new Character variable set equal to character
                Character newChar = character;
                // Create a new Count variable set equal to 1
                Integer newCount = 1;
                // Put it in the hashmap
                char_count.put(newChar, newCount);

            } else {
                // Execute a put again, this time pulling the existing value
                // of the entry at this key and updating by 1
                Character currentChar = character;
                Integer newCount = char_count.get(currentChar) + 1;
                char_count.put(currentChar, newCount);

            }
        }

        for (Map.Entry<Character, Integer> counted_char : char_count.entrySet()) {
            System.out.println(counted_char.getKey() + ": " + counted_char.getValue());
        }

    }

}

