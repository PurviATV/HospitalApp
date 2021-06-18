import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hospital {

    private List<Patient> patientList;
    public static final String location = "Bangalore";

    public Hospital()
    {
        patientList=new ArrayList<>();
    }

    public List<Patient> addPatient(Patient... patient) {
        patientList.addAll(Arrays.asList(patient));
        return patientList;
    }

    public long getTotalPatientsCount()
    {
        return patientList.size();
    }


    public long getBangalorePatientsCount(LocalDate startDate, LocalDate endDate) {
        return patientList.stream().filter(patient -> patient.getLocationOfPatient().equals(location) && patient.isPatientVisitInDateRange(startDate, endDate)).count();

    }

    public long getOutStationPatientCount(LocalDate startDate, LocalDate endDate)
    {
        return patientList.size()-getBangalorePatientsCount(startDate,endDate);
    }



}
