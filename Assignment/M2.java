package Assignment;


class M2 {
    public static void main(String[] args) {
        String original1 = "hello world";
        String typed1 = "hello worlt";

        String original2 = "coding";
        String typed2 = "coding";

        checkTypingAccuracy(original1, typed1);
        checkTypingAccuracy(original2, typed2);
    }

    static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int total = original.length();
        int firstMismatch = -1;

        for (int i = 0; i < total; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else {
                if (firstMismatch == -1) {
                    firstMismatch = i;
                }
            }
        }

        double accuracy = (double) matched / total * 100;

        System.out.println("Matched: " + matched + "/" + total + " | Accuracy: " + String.format("%.2f", accuracy) + "%");

        if (firstMismatch != -1) {
            System.out.println("First Mismatch at position " + firstMismatch + " ('" + original.charAt(firstMismatch) + "' vs '" + typed.charAt(firstMismatch) + "')");
        } else {
            System.out.println("No Mismatches");
        }
    }
}
