import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Patient p1 = new Patient("Name1", "Bangalore", LocalDate.parse("18-06-2021"));
        Patient p2 = new Patient("Name2", "Bangalore", LocalDate.parse("18-06-2021"));
        Patient p3 = new Patient("Name3", "Bangalore", LocalDate.parse("18-06-2021"));
        Patient p4 = new Patient("Name4", "Hubli", LocalDate.parse("18-06-2021"));
        Patient p5 = new Patient("Name5", "Mysore", LocalDate.parse("18-06-2021"));
        Patient p6 = new Patient("Name6", "Mangalore", LocalDate.parse("18-06-2021"));
        Patient p7 = new Patient("Name7", "Hubli", LocalDate.parse("18-06-2021"));
        Patient p8 = new Patient("Name8", "Mangalore", LocalDate.parse("18-06-2021"));

        Hospital h1=new Hospital();
        h1.addPatient(p1,p2,p3,p4,p5,p6,p7,p8);


    }
}
