import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hospital {

    private List<Patient> patientList;
    private String location;

    public Hospital(String location) {
        patientList = new ArrayList<>();
        this.location=location;
    }

    public List<Patient> addPatient(Patient... patient) {
        patientList.addAll(Arrays.asList(patient));
        return patientList;
    }
    public String getHospitalLocation()
    {
        return this.location;
    }

    public long getTotalPatientsCount(LocalDate startDate, LocalDate endDate) {
        return patientList.stream().filter(patient -> patient.isPatientVisitInDateRange(startDate, endDate)).count();
    }


    public long getBangalorePatientsCount(LocalDate startDate, LocalDate endDate) {
        return patientList.stream().filter(patient -> patient.getLocationOfPatient().equals(location) && patient.isPatientVisitInDateRange(startDate, endDate)).count();

    }

    public long getOutStationPatientCount(LocalDate startDate, LocalDate endDate) {
        return patientList.size() - getBangalorePatientsCount(startDate, endDate);
    }




}
