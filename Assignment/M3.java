package Assignment;
class M1{
    public static void main(String[] args) {
        String signalLog1 = "RRGGGYRR";
        String signalLog2 = "RRRRYYGG";

        findLongestStreak(signalLog1);
        findLongestStreak(signalLog2);
    }

    static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Signal log is empty.");
            return;
        }

        char longestColor = signalLog.charAt(0);
        int longestLength = 1;

        char currentColor = signalLog.charAt(0);
        int currentLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentColor) {
                currentLength++;
            } else {
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestColor = currentColor;
                }
                currentColor = signalLog.charAt(i);
                currentLength = 1;
            }
        }

        // Final check at the end of the loop
        if (currentLength > longestLength) {
            longestLength = currentLength;
            longestColor = currentColor;
        }

        System.out.println("Longest Streak: '" + longestColor + "' repeated " + longestLength + " times");
    }
}