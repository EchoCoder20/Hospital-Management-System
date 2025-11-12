package Entities;

import Interface.Displayable;
import utils.HelperUtils;

import java.time.LocalDate;
import java.util.List;

public class Nurse extends Person  {
    private String nurseId;
    private String departmentId;
    private String shift; // Morning / Evening / Night
    private String qualification;
    private List<Patient> assignedPatients;

    public Nurse(String id, String firstName, String lastName, LocalDate dateOfBirth, String gender, String phoneNumber, String email, String address, String nurseId, String departmentId, String shift, String qualification, List<Patient> assignedPatients) {
        super(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);
        this.nurseId = nurseId;
        this.departmentId = departmentId;
        this.shift = shift;
        this.qualification = qualification;
        this.assignedPatients = assignedPatients;
    }
    public static class Builder {
        String id;
        String firstName;
        String lastName;
        LocalDate dateOfBirth;
        String gender;
        String phoneNumber;
        String email;
        String address;
        String nurseId;
        String departmentId;
        String shift; // Morning / Evening / Night
        String qualification;
        List<Patient> assignedPatients;
        public Nurse.Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Nurse.Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Nurse.Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Nurse.Builder setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Nurse.Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Nurse.Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Nurse.Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Nurse.Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        public Nurse.Builder setNurseId(String nurseId) {
            this.nurseId = nurseId;
            return this;
        }
        public Nurse.Builder setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Nurse.Builder setShift(String shift) {
            this.shift = shift;
            return this;
        }
        public Nurse.Builder setQualification(String qualification) {
            this.qualification = qualification;
            return this;
        }
        public Nurse.Builder setAssignedPatients(List<Patient> assignedPatients) {
            this.assignedPatients = assignedPatients;
            return this;
        }
        public Nurse build(){
            return new Nurse(id, firstName, lastName, dateOfBirth, gender, phoneNumber, email, address,nurseId,departmentId,shift,qualification,assignedPatients
            );
        }

    }

        public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = HelperUtils.generateId("NUR");;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public List<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    public void setAssignedPatients(List<Patient> assignedPatients) {
        this.assignedPatients = assignedPatients;
    }
    public void displayInfo(){
        super.displayInfo();
    }

    @Override
    public void displaySummery() {

    }

    public void assignPatient(){

    }
    public void removePatient(){

    }
}
