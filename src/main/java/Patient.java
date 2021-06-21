import java.time.LocalDate;

public class Patient {

    private String fullName;
    private String location;
    private LocalDate dateOfRegistration;

    public Patient(String fullName, String location, LocalDate dateOfRegistration) {
        this.fullName = fullName;
        this.location = location;
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getPatientName() {
        return this.fullName;
    }

    public String getLocationOfPatient() {
        return this.location;
    }

    public boolean isPatientIsInDateRange(LocalDate startDate, LocalDate lastDate) {
        if (dateOfRegistration.isAfter(startDate) && dateOfRegistration.isBefore(lastDate))
            return true;
        else
            return false;
    }


}
