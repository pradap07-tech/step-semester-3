class SrmStudent {

    static String collegeName;
    static String academicYear;

    static {
        collegeName = "SRM Institute of Science and Technology";
        academicYear = "2026-2027";
        System.out.println("College info loaded");
    }

    String name;

   
    SrmStudent(String name) {
        this.name = name;
        System.out.println("Student record created: " + name);
    }
}

public class M4 {

    public static void main(String[] args) {

        String[] names = {"Ravi", "Meera", "Karthik", "Divya", "Anitha"};

        for (String name : names) {
            new SrmStudent(name);
        }
    }
}