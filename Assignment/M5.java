package Assignment;


public class M5 {
    public static void main(String[] args) {
        String feedback = "The mentor was great, the session was great and clear.";
        printFilteredWordFrequency(feedback);
    }
    void printFilteredWordFrequency(String feedback) {
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        String cleanedFeedback = feedback.toLowerCase().replace(".", "").replace(",", "");
        String[] words = cleanedFeedback.split("\\s+");
        java.util.Map<String, Integer> wordCountMap = new java.util.HashMap<>();

        for (String word : words) {
            boolean isStopWord = false;
            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    isStopWord = true;
                    break;
                }
            }
            if (!isStopWord) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        java.util.List<java.util.Map.Entry<String, Integer>> sortedEntries = new java.util.ArrayList<>(wordCountMap.entrySet());
        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        for (java.util.Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
