package Assignment;

class M1 {
    public static void main(String[] args) {
        int[] seatNumbers1 = {101, 102, 103, 102, 105};
        int[] seatNumbers2 = {101, 102, 103, 104, 105};

        checkDuplicateSeats(seatNumbers1);
        checkDuplicateSeats(seatNumbers2);
    }

    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;
        StringBuilder duplicates = new StringBuilder();

        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    if (!duplicates.toString().contains(String.valueOf(seatNumbers[i]))) {
                        duplicates.append(seatNumbers[i]).append(" ");
                        duplicateFound = true;
                    }
                }
            }
        }

        if (duplicateFound) {
            System.out.println("Duplicate Seat Number Found: " + duplicates.toString().trim());
        } else {
            System.out.println("No Duplicate Seats Found");
        }
    }
}