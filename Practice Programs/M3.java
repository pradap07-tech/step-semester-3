class FeeCalculator{
    String regNo;
    int daysLate;
    int totalFees;
    FeeCalculator(String regNo, int totalFees, int daysLate) {
        this.regNo = regNo;
        this.totalFees = totalFees;
        this.daysLate = daysLate;
    }

    final int CalculateFine(int daysLate, int totalFees){
        if(daysLate <= 0){
            return 0;
        }
        return (int)(totalFees * 0.01 * daysLate);
    }
    final void printDetails(){
        int fine = CalculateFine(this.daysLate, this.totalFees);
        if (fine == 0){
            System.out.println(this.regNo + " | " + "On time, no late fee");
        } else {
            System.out.println(this.regNo + " | Total Fees: " + this.totalFees + " | Days Late: " + this.daysLate + " | Fine: " + fine);
        }
    }
}
public class M3 {
    public static void main(String[] args) {
        String[] regNos = {"RA001","RA002","RA003","RA004"};
        int[] totalFees = {200000,150000,180000,220000};
        int[] daysLate = {10, 0, -2, 5};
        FeeCalculator[] feeCalculator = new FeeCalculator[regNos.length];
        for (int i = 0; i < regNos.length; i++) {
            feeCalculator[i] = new FeeCalculator(regNos[i], totalFees[i], daysLate[i]);
        }
        for (FeeCalculator fc : feeCalculator) {
            fc.printDetails();
        }
    }
    
}
