package exercises;

public class FiveLetterWords {
    public static void main(String[] args) {
        String words[] = {"This", "list", "has", "seven", "words", "that", "have", "five", "letters", "in", "them"};

        for(String word : words) {
            if(word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
