package Entities;

import java.time.LocalDate;
import java.util.List;

public class Doctor extends Person  {
    private String doctorId;
    private String specialization;
    private String qualification;
    private int experienceYears;
    private String departmentId;
    private double consultationFee;
    private List<String> availableSlots;
    private List<Patient> assignedPatients;

    public Doctor(String id, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String doctorId, String specialization, String qualification, int experienceYears, String departmentId, double consultationFee, List<String> availableSlots, List<Patient> assignedPatients) {
        super(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);
        this.doctorId = doctorId;
        this.specialization = specialization;
        this.qualification = qualification;
        this.experienceYears = experienceYears;
        this.departmentId = departmentId;
        this.consultationFee = consultationFee;
        this.availableSlots = availableSlots;
        this.assignedPatients = assignedPatients;
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
        String doctorId;
        String specialization;
        String qualification;
        int experienceYears;
        String departmentId;
        double consultationFee;
        List<String> availableSlots;
        List<Patient> assignedPatients;

        public Doctor.Builder setId(String id) { this.id = id; return this; }
        public Doctor.Builder setFirstName(String firstName) { this.firstName = firstName; return this; }
        public Doctor.Builder setLastName(String lastName) { this.lastName = lastName; return this; }
        public Doctor.Builder setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; return this; }
        public Doctor.Builder setGender(String gender) { this.gender = gender; return this; }
        public Doctor.Builder setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; return this; }
        public Doctor.Builder setEmail(String email) { this.email = email; return this; }
        public Doctor.Builder setAddress(String address) { this.address = address; return this; }
        public Doctor.Builder setDoctorId(String doctorId) {
            this.doctorId = doctorId;
            return this;
        }
        public Doctor.Builder setSpecialization(String specialization) {
            this.specialization = specialization;
            return this;
        }
        public Doctor.Builder setQualification(String qualification) {
            this.qualification = qualification;
            return this;
        }
        public Doctor.Builder  setExperienceYears(int experienceYears) {
            this.experienceYears = experienceYears;
            return this;
        }
        public Doctor.Builder setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Doctor.Builder setConsultationFee(double consultationFee) {
            this.consultationFee = consultationFee;
            return this;
        }

        public Doctor.Builder setAvailableSlots(List<String> availableSlots) {
            this.availableSlots = availableSlots;
            return this;
        }
        public Doctor.Builder setAssignedPatients(List<Patient> assignedPatients) {
            this.assignedPatients = assignedPatients;
            return this;
        }

        public Doctor build() {
            return new Doctor(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address,doctorId,specialization,qualification,experienceYears
            ,departmentId,consultationFee,availableSlots,assignedPatients
            );
        }

    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public List<String> getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(List<String> availableSlots) {
        this.availableSlots = availableSlots;
    }

    public List<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    public void setAssignedPatients(List<Patient> assignedPatients) {
        this.assignedPatients = assignedPatients;
    }
    public void displayInfo(){
        super.displayInfo();
//        We will add more details later
    }

    @Override
    public void displaySummery() {

    }

    public  void assignPatient(Patient patientFound){
    }
    public  void removePatient(){

    }
    public  void updateAvailability(){

    }
    //Overloaded Method
    public  void updateFee(double fee){

    }
    public  void updateFee(double fee, String reason){

    }
    public  void addAvailability(String slot){

    }
    public  void addAvailability(List<String> slots){

    }
}

