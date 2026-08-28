class PayrollAccount{
    private double basicSalary;
    private double bonus;
    public PayrollAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Warning: Basic salary cannot be negative. Starting at 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
        this.bonus = 0;
    }
    
    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Warning: Bonus amount cannot be zero or negative.");
        } else {
            this.bonus += amount;
        }
    }
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Warning: Tax percentage must be between 0 and 100.");
        } else {
            this.basicSalary -= (this.basicSalary * percent / 100);
        }
    }
    public double getNetSalary() {
        return this.basicSalary + this.bonus;
    }
}

public class M2 {
    public static void main(String[] args) {
        PayrollAccount account = new PayrollAccount(50000);
        int tax = 10;
        
        account.creditBonus(5000);
        account.deductTax(10);
        System.out.println("Bonus credited: Rs " + 5000.0);
        System.out.println("Tax deducted:"+tax+"%");
        System.out.println("Net salary: Rs " + account.getNetSalary());
    }

}
