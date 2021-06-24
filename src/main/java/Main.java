import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Patients Records For Hospital ***");
        System.out.println("--------------------------------------------------------------------------------");
        Hospital h1 = new Hospital("Bangalore");
        Patient p1, p2, p3, p4, p5;
        p1 = new Patient("Name1", "Bangalore", LocalDate.parse("2021-06-20"));
        p2 = new Patient("Name2", "Bangalore", LocalDate.parse("2021-06-20"));
        p3 = new Patient("Name3", "Bangalore", LocalDate.parse("2021-06-19"));
        p4 = new Patient("Name4", "Hubli", LocalDate.parse("2021-06-18"));
        p5 = new Patient("Name5", "Mysore", LocalDate.parse("2021-06-20"));
        h1.addPatient(p1,p2,p3,p4,p5);
        Scanner input = new Scanner(System.in);
        int status = 1, choice;
        while (status == 1) {
            System.out.println("            **MAIN SECTION**          ");
            System.out.println(
                    "1. Add New Patient \n2. Get Local Patients Percentage \n3. Get Outstation Patients Percentage");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Patient Name");
                    String name = input.next();
                    System.out.println("Enter Patient Location");
                    String location = input.next();
                    System.out.println("Enter Date in yyyy-mm-dd format");
                    String date = input.next();
                    Patient p6 = new Patient(name, location, LocalDate.parse(date));
                    h1.addPatient(p6);
                    System.out.println("Patient added");
                    break;
                case 2:
                    System.out.println("Enter Start Date in yyyy-mm-dd format");
                    String fromDate = input.next();
                    System.out.println("Enter End Date in yyyy-mm-dd format");
                    String toDate = input.next();
                    long localPatientsCount = h1.getLocalPatientsCount(LocalDate.parse(fromDate), LocalDate.parse(toDate));
//                    double localPer = calculatePercentage(localPatientsCount,h1.getTotalPatientsCount(LocalDate.parse(fromDate), LocalDate.parse(toDate)));
//                    System.out.println("Local Patients Percentage: " + localPer);
                    break;
                case 3:
                    System.out.println("Enter Start Date in yyyy-mm-dd format");
                    String fromDate1 = input.next();
                    System.out.println("Enter End Date in yyyy-mm-dd format");
                    String toDate1 = input.next();
                    long outstationPatientCount = h1.getOutStationPatientCount(LocalDate.parse(fromDate1), LocalDate.parse(toDate1));
//                    double outStationPatient = calculatePercentage(outstationPatientCount,h1.getTotalPatientsCount(LocalDate.parse(fromDate1), LocalDate.parse(toDate1)));
//                    System.out.println("Outstation Patients Percentage: " + outStationPatient);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
                System.out.println("\nReturn to Main Menu Press 1 OR any other number to exit");
                status = input.nextInt();
            }*/
        }


    }


