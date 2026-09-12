

package Assignment;

public class M2 {
    public static void main(String[] args) {
        String sentence1 = "hello club";
        String sentence2 = "coding is fun";

        System.out.println(reverseEachWord(sentence1));
        System.out.println(reverseEachWord(sentence2));
    }
    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            reversedSentence.append(new StringBuilder(word).reverse()).append(" ");
        }
        return reversedSentence.toString().trim();
    }

}
