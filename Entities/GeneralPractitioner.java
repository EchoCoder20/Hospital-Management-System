package Entities;

import Interface.Displayable;

import java.time.LocalDate;
import java.util.List;

public class GeneralPractitioner extends Doctor  {
    private boolean walkinAvailable;
    private boolean homeVisitAvailable;
    private boolean vaccinationCertified;

    public GeneralPractitioner(String id, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String doctorId, String specialization, String qualification, int experienceYears, String departmentId, double consultationFee, List<String> availableSlots, List<Patient> assignedPatients, boolean walkinAvailable, boolean homeVisitAvailable, boolean vaccinationCertified) {
        super(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, doctorId, specialization, qualification, experienceYears, departmentId, consultationFee, availableSlots, assignedPatients);
        this.walkinAvailable = walkinAvailable;
        this.homeVisitAvailable = homeVisitAvailable;
        this.vaccinationCertified = vaccinationCertified;
    }

    public boolean isWalkinAvailable() {
        return walkinAvailable;
    }

    public void setWalkinAvailable(boolean walkinAvailable) {
        this.walkinAvailable = walkinAvailable;
    }

    public boolean isHomeVisitAvailable() {
        return homeVisitAvailable;
    }

    public void setHomeVisitAvailable(boolean homeVisitAvailable) {
        this.homeVisitAvailable = homeVisitAvailable;
    }

    public boolean isVaccinationCertified() {
        return vaccinationCertified;
    }

    public void setVaccinationCertified(boolean vaccinationCertified) {
        this.vaccinationCertified = vaccinationCertified;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Walk-in Available: " + walkinAvailable);
        System.out.println("Home Visit Available: " + homeVisitAvailable);
        System.out.println("Vaccination Certified: " + vaccinationCertified);
    }

    // GP-specific methods
    public boolean scheduleHomeVisit(Patient patient, LocalDate date, String time) {
        return false;
    }

    public boolean administerVaccine(Patient patient, String vaccineType) {
        return false;
    }
}
