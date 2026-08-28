import java.util.Scanner;
class Employee{
    String empId;
    String empName;
    double salary;
    boolean isIntern;
    Employee(String empId, String empName,double salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }
    Employee(String empId, String empName){
        this.empId = empId;
        this.empName = empName;
        this.salary = 0;
        this.isIntern = true;
    }
    void printDetails(){
           System.out.println("E-" + empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }

}
public class M3 {
    public static void main(String[] args) {
        System.out.printf("Enter the number of employees: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];
        System.out.printf("Enter employee details (empId, empName, salary) or (empId, empName) for interns:\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee %d ID: ", i + 1);
            String empId = sc.next();
            System.out.printf("Enter employee name: ");
            String empName = sc.next();
            System.out.printf("Enter employee salary (or leave blank for interns): ");
            if (sc.hasNextDouble()) {
                double salary = sc.nextDouble();
                if(salary <= 0){
                    employees[i] = new Employee(empId, empName);
                } else {    
                    employees[i] = new Employee(empId, empName, salary);
                }
            } 
        }
        for (Employee e : employees) {
            e.printDetails();
        }
    }
}
