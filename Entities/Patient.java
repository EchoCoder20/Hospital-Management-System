package Entities;

import java.time.LocalDate;
import java.util.List;

public class Patient extends Person  {
    private String patientId;
    private String bloodGroup;
    private List<String> allergies;
    private String emergencyContact;
    private LocalDate registrationDate;
    private String insuranceId;
    private List<MedicalRecord> medicalRecords;
    private List<Appointment> appointments;

    public Patient(String id, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String patientId, String bloodGroup, List<String> allergies, String emergencyContact, LocalDate registrationDate, String insuranceId, List<MedicalRecord> medicalRecords, List<Appointment> appointments) {
        super(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);
        this.patientId = patientId;
        this.bloodGroup = bloodGroup;
        this.allergies = allergies;
        this.emergencyContact = emergencyContact;
        this.registrationDate = registrationDate;
        this.insuranceId = insuranceId;
        this.medicalRecords = medicalRecords;
        this.appointments = appointments;
    }

    public static class Builder{
        String id;
        String firstName;
        String lastName;
        LocalDate dateOfBirth;
        String gender;
        String phoneNumber;
        String email;
        String address;
        String patientId;
        String bloodGroup;
        List<String> allergies;
        String emergencyContact;
        LocalDate registrationDate;
        String insuranceId;
        List<MedicalRecord> medicalRecords;
        List<Appointment> appointments;
        public Builder setId(String id) { this.id = id; return this; }
        public Builder setFirstName(String firstName) { this.firstName = firstName; return this; }
        public Builder setLastName(String lastName) { this.lastName = lastName; return this; }
        public Builder setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; return this; }
        public Builder setGender(String gender) { this.gender = gender; return this; }
        public Builder setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; return this; }
        public Builder setEmail(String email) { this.email = email; return this; }
        public Builder setAddress(String address) { this.address = address; return this; }
        public Builder setPatientId(String patientId) { this.patientId = patientId; return this; }
        public Builder setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; return this; }
        public Builder setAllergies(List<String> allergies) { this.allergies = allergies; return this; }
        public Builder setEmergencyContact(String emergencyContact) { this.emergencyContact = emergencyContact; return this; }
        public Builder setRegistrationDate(LocalDate registrationDate) { this.registrationDate = registrationDate; return this; }
        public Builder setInsuranceId(String insuranceId) { this.insuranceId = insuranceId; return this; }
        public Builder setMedicalRecords(List<MedicalRecord> medicalRecords) { this.medicalRecords = medicalRecords; return this; }
        public Builder setAppointments(List<Appointment> appointments) { this.appointments = appointments; return this; }

        public Patient build() {
            return new Patient(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address,
                    patientId, bloodGroup, allergies, emergencyContact, registrationDate, insuranceId, medicalRecords, appointments);
        }
    }


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
    public void addMedicalRecord(){

    }
    public void addAppointment(){

    }
    public void updateInsurance(){

    }
    public void updateContact(String phone){

    }
    public void updateContact(String phone, String email){

    }
    public void updateContact(String phone, String email, String address){

    }
    public void displayInfo(){
        super.displayInfo();
//        We will add more details later
    }

    @Override
    public void displaySummery() {

    }
}
