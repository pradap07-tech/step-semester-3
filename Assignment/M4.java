
class HallTicket{
    String studentName;
    int seatNumber;
    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
    

}
public class M4 {
    
    public static void main(String[] args) {
        HallTicket priya = new HallTicket("Priya", 0);
        HallTicket copy = priya;
        copy.seatNumber = 45;
        HallTicket separate = new HallTicket("Priya", 45);
        

        
        System.out.println(priya.studentName + "'s seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == " + priya.studentName + ": " + (copy == priya));
        System.out.println("separate == " + priya.studentName + ": " + (separate == priya));
    }
}
