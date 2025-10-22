package Entities;

import Interface.Displayable;

import java.time.LocalDate;
import java.util.List;

public class Surgeon extends Doctor  {
    private int surgeriesPerformed;
    private List<String> surgeryTypes;
    private boolean operationTheatreAccess;

    public Surgeon(String id, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String doctorId, String specialization, String qualification, int experienceYears, String departmentId, double consultationFee, List<String> availableSlots, List<Patient> assignedPatients, int surgeriesPerformed, List<String> surgeryTypes, boolean operationTheatreAccess) {
        super(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, doctorId, specialization, qualification, experienceYears, departmentId, consultationFee, availableSlots, assignedPatients);
        this.surgeriesPerformed = surgeriesPerformed;
        this.surgeryTypes = surgeryTypes;
        this.operationTheatreAccess = operationTheatreAccess;
    }

    public int getSurgeriesPerformed() {
        return surgeriesPerformed;
    }

    public void setSurgeriesPerformed(int surgeriesPerformed) {
        this.surgeriesPerformed = surgeriesPerformed;
    }

    public List<String> getSurgeryTypes() {
        return surgeryTypes;
    }

    public void setSurgeryTypes(List<String> surgeryTypes) {
        this.surgeryTypes = surgeryTypes;
    }

    public boolean isOperationTheatreAccess() {
        return operationTheatreAccess;
    }

    public void setOperationTheatreAccess(boolean operationTheatreAccess) {
        this.operationTheatreAccess = operationTheatreAccess;
    }
    public void performSurgery(String surgeryType, Patient patient) {
        // Implementation could log surgery performed on patient
        // and update surgeriesPerformed count
    }
    public void updateSurgeryCount() {
        surgeriesPerformed++;
    }

}
