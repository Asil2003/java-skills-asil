public class TextProcessor {

    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static String replaceWord(String text, String oldWord, String newWord) {
        if (text == null || oldWord == null || newWord == null) {
            return text;
        }
        return text.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        String test = "Java is fun and Java is powerful";

        System.out.println("Original sentence:");
        System.out.println(test);

        int wordCount = countWords(test);
        System.out.println("\nWord count: " + wordCount);

        String replaced = replaceWord(test, "Java", "Programming");
        System.out.println("\nAfter replacing \"Java\" with \"Programming\":");
        System.out.println(replaced);
    }
}
