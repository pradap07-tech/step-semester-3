class Employee{
    String Empid;
    double salary;
    Employee(String Empid, double salary) {
        this.Empid = Empid;
        this.salary = salary;
    }
    void raiseSalary(int rsalary){
        salary += rsalary;
    }
    void printDetails(){
        System.out.println(Empid + " | Final Salary: " + salary);
    }
}
public class M2 {
    public static void main(String[] args){
        String[] Empids = {"E-101", "E-102", "E-103", "E-104"};
        double[] salaries = {40000, 55000,62000, 48000};
        
        for (int i = 0; i < Empids.length; i++) {
            Employee emp = new Employee(Empids[i], salaries[i]);
            emp.raiseSalary(5000);
            emp.printDetails();
        }
    }
    
}
