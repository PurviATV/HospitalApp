import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.List;

public class HospitalTest {
    Hospital chinmayHospital;
    Patient p1, p2, p3, p4, p5;

    @BeforeClass
    public void CreatePatients_And_Hospital() {
        p1 = new Patient("Name1", "Bangalore");
        p1.addVisits(new VisitDate(LocalDate.parse("2021-06-20")));
        p2 = new Patient("Name2", "Bangalore" );
        p2.addVisits(new VisitDate(LocalDate.parse("2021-06-20")));
        p3 = new Patient("Name3", "Bangalore");
        p3.addVisits(new VisitDate(LocalDate.parse("2021-06-19")));
        p4 = new Patient("Name4", "Hubli");
        p4.addVisits(new VisitDate(LocalDate.parse("2021-06-18")));
        p5 = new Patient("Name5", "Mysore");
        p5.addVisits(new VisitDate(LocalDate.parse("2021-06-20")));

        chinmayHospital = new Hospital("Bangalore");
    }

    @Test
    public void Test001_Admit_Patients_To_Hospital() {
        List<Patient> patients = chinmayHospital.addPatient(p1, p2, p3, p4, p5);
        Assert.assertEquals(patients.size(), 5);
        Reporter.log("5 Patients are admitted to Chinmay Hospital", true);
    }

    @Test
    public void Test002_Verify_Patient_Is_Not_Local() {
        Patient p6 = new Patient("Name6", "Mysore");
        p6.addVisits(new VisitDate(LocalDate.parse("2021-06-20")));
        chinmayHospital.addPatient(p6);
        Assert.assertNotEquals(p6.getLocationOfPatient(), chinmayHospital.getHospitalLocation());
        Reporter.log("Patient:" +p6.getPatientName()+" is not local");
    }
    @Test
    public void Test0021_Verify_Patient_Is_Local() {
        Patient p7 = new Patient("Name6", "Bangalore");
        p7.addVisits(new VisitDate(LocalDate.parse("2021-06-20")));
        chinmayHospital.addPatient(p7);
        Assert.assertEquals(p7.getLocationOfPatient(), chinmayHospital.getHospitalLocation());
        Reporter.log("Patient:" +p7.getPatientName()+" is local");
    }

    long localPatients, outstationPatients;

    @Test
    public void Test003_Verify_Count_Of_Local_Patients_For_DateRange() {
        localPatients = chinmayHospital.
                getLocalPatientsCount(LocalDate.parse("2021-06-17"), LocalDate.parse("2021-06-21"));
        Assert.assertEquals(localPatients, 4);
        Reporter.log("4 local patients are admitted to chinmayHospital",true);
    }

    @Test
    public void Test004_Verify_Count_Of_OutStation_Patients() {
        outstationPatients = chinmayHospital.
                getOutStationPatientCount(LocalDate.parse("2021-06-17"), LocalDate.parse("2021-06-21"));
        Assert.assertEquals(outstationPatients, 3);
        Reporter.log("3 outstation patients are admitted to chinmayHospital",true);

    }
    @Test
    public void Test005_Verify_Percentage_Of_Local_Patients() {
        Assert.assertEquals(chinmayHospital.
                getLocalPatientPercentage(LocalDate.parse("2021-06-17"), LocalDate.parse("2021-06-21")), 57.14);
        Reporter.log("Percentage of local patient is 57%",true);

    }
    @Test
    public void Test006_Verify_Percentage_Of_Outstation_Patients() {
        Assert.assertEquals(chinmayHospital
                .getLOutStationPatientPercentage(LocalDate.parse("2021-06-17"), LocalDate.parse("2021-06-21")),42.86);
        Reporter.log("Percentage of outstation patient is 42%",true);

    }
    @Test
    public void Test007_Verify_Percentage_Of_Outstation_Patients_When_No_Matching_Data() {
        Assert.assertEquals(chinmayHospital
                .getLOutStationPatientPercentage(LocalDate.parse("2021-06-20"), LocalDate.parse("2021-06-21")), 0.0);
        Reporter.log("Percentage of outstation patient is 0%",true);

    }
}
