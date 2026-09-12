
package Assignment;

class M4{
    public static void main(String[] args) {
        int[] sectionA1 = {20, 15, 30};
        int[] sectionB1 = {25, 10, 30};

        int[] sectionA2 = {10, 20, 30};
        int[] sectionB2 = {5, 15, 25};

        analyzeInventory(sectionA1, sectionB1);
        analyzeInventory(sectionA2, sectionB2);
    }
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA.length != sectionB.length) {
            System.out.println("Error: Sections must have the same number of items.");
            return; 
        }

        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            totalB += sectionB[i];
        }

        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB);

        if (totalA == totalB) {
            System.out.println("Status: Balanced");
        } else {
            System.out.println("Status: Not Balanced");
        }

        int maxQuantity = Integer.MIN_VALUE;
        String maxSection = "";
        int maxIndex = -1;

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > maxQuantity) {
                maxQuantity = sectionA[i];
                maxSection = "Section A";
                maxIndex = i;
            }
            if (sectionB[i] > maxQuantity) {
                maxQuantity = sectionB[i];
                maxSection = "Section B";
                maxIndex = i;
            }
        }

        System.out.println("Highest Quantity: " + maxQuantity + " (" + maxSection + ", Item " + (maxIndex + 1) + ")");
    }
}