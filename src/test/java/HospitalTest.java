import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.List;

public class HospitalTest {
    Hospital hospital;
    Patient p1, p2, p3, p4, p5;

    @BeforeClass
    public void CreatePatients() {
        p1 = new Patient("Name1", "Bangalore", LocalDate.parse("2021-06-20"));
        p2 = new Patient("Name2", "Bangalore", LocalDate.parse("2021-06-20"));
        p3 = new Patient("Name3", "Bangalore", LocalDate.parse("2021-06-19"));
        p4 = new Patient("Name4", "Hubli", LocalDate.parse("2021-06-18"));
        p5 = new Patient("Name5", "Mysore", LocalDate.parse("2021-06-20"));
        hospital = new Hospital();
    }

    @Test
    public void Test001_Admit_Patients_To_Hospital() {
        List<Patient> patients = hospital.addPatient(p1, p2, p3, p4, p5);
        Assert.assertEquals(patients.size(), 5);
        Reporter.log("5 Patients are admitted to hospital", true);
    }

    @Test
    public void Test002_Verify_If_Patient_Is_Local() {
        Patient p6 = new Patient("Name6", "Mysore", LocalDate.parse("2021-06-20"));
        hospital.addPatient(p6);
        Assert.assertNotEquals(p6.getLocationOfPatient(), (Hospital.location));
    }
long localPatients,outstationPatients;
    @Test
    public void Test003_Verify_Count_Of_Local_Patients() {
        localPatients=hospital.getBangalorePatientsCount(LocalDate.parse("2021-06-17"), LocalDate.parse("2021-06-21"));
        Assert.assertEquals(localPatients, 3);
    }
    @Test
    public void Test004_Verify_Count_Of_OutStation_Patients() {
        outstationPatients=hospital.getOutStationPatientCount(LocalDate.parse("2021-06-17"), LocalDate.parse("2021-06-21"));
        Assert.assertEquals(outstationPatients, 3);
    }

    @Test
    public void Test005_Verify_Percentage_Of_Local_Patients()
    {
        Assert.assertEquals(localPatients*100/hospital.getTotalPatientsCount(),50);
    }
}