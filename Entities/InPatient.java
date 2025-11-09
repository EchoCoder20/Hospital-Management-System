package Entities;

import Interface.Billable;

import java.time.LocalDate;
import java.util.List;

public class InPatient extends Patient implements Billable {
    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private String roomNumber;
    private String bedNumber;
    private String admittingDoctorId;
    private double dailyCharges;

    public InPatient(String id, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String patientId, String bloodGroup, List<String> allergies, String emergencyContact, LocalDate registrationDate, String insuranceId, List<MedicalRecord> medicalRecords, List<Appointment> appointments, LocalDate admissionDate, LocalDate dischargeDate, String roomNumber, String bedNumber, String admittingDoctorId, double dailyCharges) {
        super(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address, patientId, bloodGroup, allergies, emergencyContact, registrationDate, insuranceId, medicalRecords, appointments);
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
        this.admittingDoctorId = admittingDoctorId;
        this.dailyCharges = dailyCharges;
    }

    public static class Builder extends Patient.Builder{
        private LocalDate admissionDate;
        private LocalDate dischargeDate;
        private String roomNumber;
        private String bedNumber;
        private String admittingDoctorId;
        private double dailyCharges;
        public Builder setAdmissionDate(LocalDate admissionDate) {
            this.admissionDate = admissionDate;
            return this;
        }
        public Builder dischargeDate(LocalDate date) {
            this.dischargeDate = date;
            return this;
        }

        public Builder roomNumber(String room) {
            this.roomNumber = room;
            return this;
        }

        public Builder bedNumber(String bed) {
            this.bedNumber = bed;
            return this;
        }

        public Builder admittingDoctorId(String id) {
            this.admittingDoctorId = id;
            return this;
        }

        public Builder dailyCharges(double charges) {
            this.dailyCharges = charges;
            return this;
        }
        public InPatient build(){
            return new InPatient( id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address,
                    patientId, bloodGroup, allergies, emergencyContact, registrationDate, insuranceId,
                    medicalRecords, appointments,
                    admissionDate, dischargeDate, roomNumber, bedNumber, admittingDoctorId, dailyCharges);
        }
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public String getAdmittingDoctorId() {
        return admittingDoctorId;
    }

    public void setAdmittingDoctorId(String admittingDoctorId) {
        this.admittingDoctorId = admittingDoctorId;
    }

    public double getDailyCharges() {
        return dailyCharges;
    }

    public void setDailyCharges(double dailyCharges) {
        this.dailyCharges = dailyCharges;
    }
    public void  calculateStayDuration(){

    }
    public void calculateTotalCharges(){

    }

    @Override
    public void displaySummery() {

    }

    @Override
    public void calculateCharges() {

    }

    @Override
    public void generateBill() {

    }

    @Override
    public void processPayment(double amount) {

    }
}
