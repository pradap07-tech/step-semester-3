

package Assignment;

class M5 {
    public static void main(String[] args) {
        String review1 = "This movie was absolutely fantastic and thrilling";
        String review2 = "A short film with a long-lasting impact";

        classifyWordLengths(review1);
        classifyWordLengths(review2);
    }

    static void classifyWordLengths(String review) {
        String[] words = review.split("\\s+");
        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (String word : words) {
            int length = word.length();
            if (length >= 1 && length <= 4) {
                shortCount++;
            } else if (length >= 5 && length <= 8) {
                mediumCount++;
            } else if (length >= 9) {
                longCount++;
            }
        }

        System.out.println("Short: " + shortCount + " | Medium: " + mediumCount + " | Long: " + longCount);
    }
}