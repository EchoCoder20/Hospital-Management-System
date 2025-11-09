package Services;

import Entities.*;
import Interface.Manageable;
import Interface.Searchable;
import utils.HelperUtils;
import utils.InputHandler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PatientService implements Manageable, Searchable {
    static Scanner scanner=new Scanner(System.in);
    static List<Patient> patients=new ArrayList<>();
    static List<InPatient> inPatients=new ArrayList<>();
    public static Patient createPatientFromInput(int idType){
        String id = HelperUtils.generateId();
        scanner.nextLine();
        String firstName = InputHandler.getStringInput("Enter First Name:");
        String lastName = InputHandler.getStringInput("Enter Last Name:");
        String gender =InputHandler.getStringInput("Enter Gender :");
        String phoneNumber = InputHandler.getStringInput("Enter phone Number:");
        String email = InputHandler.getStringInput("Enter Email:");
        String address = InputHandler.getStringInput("Enter Address:");
        String patientId="" ;
        if(idType==2) {
             patientId = HelperUtils.generateId("IN-PAT");
        } else if (idType==3) {
             patientId = HelperUtils.generateId("OUT-PAT");
        } else if (idType==4) {
             patientId = HelperUtils.generateId("EME-PAT");
        }else{
             patientId = HelperUtils.generateId("PAT");
        }

        String bloodGroup = InputHandler.getStringInput("Enter Blood Group:");

        String emergencyContact = InputHandler.getStringInput("Enter Emergency Contact: ");

        LocalDate registrationDate = InputHandler.getDateInput("Enter Registration Date (YYYY-MM-DD): ");
        LocalDate birthOfDate= LocalDate.parse(InputHandler.getStringInput("Enter BOD:"));
        String insuranceId = HelperUtils.generateId();

        String allergiesInput = InputHandler.getStringInput("Enter Allergies (comma separated):");
        List<String> allergies = Arrays.asList(allergiesInput.split(","));
        List<MedicalRecord> medicalRecords = new ArrayList<>();
        List<Appointment> appointments = new ArrayList<>();

        Patient newPatient=new Patient.Builder()
                .setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setGender(gender)
                .setPhoneNumber(phoneNumber)
                .setEmail(email)
                .setAddress(address)
                .setPatientId(patientId)
                .setBloodGroup(bloodGroup)
                .setEmergencyContact(emergencyContact)
                .setRegistrationDate(registrationDate)
                .setDateOfBirth(birthOfDate)
                .setInsuranceId(insuranceId)
                .setAllergies(allergies)
                .build();
        return newPatient;

    }
    public static void addPatient(Patient patient){
        //full object
        patients.add(patient);
        System.out.println("New patient successfully added !");
    }

    public static InPatient createInPatient(Patient newPatient) {
        LocalDate admissionDate=InputHandler.getDateInput("Enter admissionDate :");
        LocalDate dischargeDate=InputHandler.getDateInput("Enter Discharge Date :");
        String roomNumber=InputHandler.getStringInput("Enter Room Number");
        String bedNumber=InputHandler.getStringInput("Enter bed Number :");
        System.out.println("Doctor Id list:");
        List<Doctor> doctors = DoctorServices.doctors;
        for(Doctor doctor: doctors){
            System.out.println(doctor.getDoctorId());
        }
        String admittingDoctorId=InputHandler.getStringInput("Write the Doctor Id from the previous list :");
        double dailyCharge=InputHandler.getDoubleInput("Enter the daily Charge");
        InPatient inPatient= (InPatient) new InPatient.Builder()
                .setAdmissionDate(admissionDate)
                .dischargeDate(dischargeDate)
                .roomNumber(roomNumber)
                .bedNumber(bedNumber)
                .admittingDoctorId(admittingDoctorId)
                .dailyCharges(dailyCharge)
                .setId(newPatient.getId())
                .setFirstName(newPatient.getFirstName())
                .setLastName(newPatient.getLastName())
                .setGender(newPatient.getGender())
                .setEmail(newPatient.getEmail())
                .setAddress(newPatient.getAddress())
                .setPatientId(newPatient.getPatientId())
                .setBloodGroup(newPatient.getBloodGroup())
                .setEmergencyContact(newPatient.getEmergencyContact())
                .setRegistrationDate(newPatient.getRegistrationDate())
                .setInsuranceId(newPatient.getInsuranceId())
                .setAllergies(newPatient.getAllergies())
                .setDateOfBirth(newPatient.getDateOfBirth())
                .build();
        return inPatient;
    }

    public void addPatient(String firstName, String lastName, String phone){
        //minimal info
    }
    public void addPatient(String firstName, String lastName, String phone, String bloodGroup, String email){
        //with blood group
    }
    public Patient editPatient(String patientId, Patient updatedPatient){
        scanner.nextLine();
        String id= updatedPatient.getId();
        String firstName = InputHandler.getStringInput("Update First Name:");
        String lastName = InputHandler.getStringInput("Update Last Name:");
        String gender =updatedPatient.getGender();
        String phoneNumber = InputHandler.getStringInput("Update phone Number:");
        String email = InputHandler.getStringInput("Update Email:");
        String address = InputHandler.getStringInput("Update Address:");
        String bloodGroup = updatedPatient.getBloodGroup();
        String emergencyContact = InputHandler.getStringInput("Update Emergency Contact: ");
        LocalDate registrationDate = updatedPatient.getRegistrationDate();
        LocalDate birthOfDate= updatedPatient.getDateOfBirth();
        String insuranceId = updatedPatient.getInsuranceId();
        List<String> allergies = updatedPatient.getAllergies();
        updatedPatient.setFirstName(firstName);
        updatedPatient.setLastName(lastName);
        updatedPatient.setPhoneNumber(phoneNumber);
        updatedPatient.setAddress(address);
        updatedPatient.setEmail(email);
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getId().equals(patientId)) {
                patients.set(i, updatedPatient);
                System.out.println("✅ Patient information updated successfully in the list!");
                return updatedPatient;
            }
        }
        return updatedPatient;
//        if(patientId.contains("IN")){
//
//
//        } else if (patientId.contains("OUT")) {
//
//        } else {
////            EME
//        }

    }
    public Boolean removePatient(String patientId){
        boolean isRemoved =patients.removeIf(patient ->patient.getPatientId().equals(patientId) );

        return isRemoved;

    }
    public Patient getPatientById(String patientId){
        return null;
    }
    public static List<Patient> displayAllPatients(){
//        for(Patient patient: patients){
//            System.out.println("patient ID :" + patient.getPatientId() + "patient Name:" + patient.getFirstName());
//        }
        return patients;
    }
    public List<Patient> displayPatients(String filter){
        //- display filtered by criteria
        return null;
    }
    public List<Patient> displayPatients(int limit) {
        // display limited number
        return null;
    }

    public Patient searchPatients(String keyword){
        //search by any field
        for(Patient patient:patients){
            if(patient.getPatientId().equals(keyword)){
                return patient;
            }
        }
        return null;
    }
    public Patient searchPatientsByName(String firstName, String lastName){

        for(Patient patient:patients){
            if(patient.getFirstName().equals(firstName) && patient.getLastName().equals(lastName)){
                return patient;
            }
        }
        return null;
    }

    @Override
    public void add(Object entity) {
        if(entity instanceof InPatient){
            inPatients.add((InPatient) entity);
        } else if (entity instanceof Patient) {
            patients.add((Patient) entity);
        }
        System.out.println("Patient Successfully added !1");
    }

    @Override
    public void remove(String id) {
           boolean isRemoved=removePatient(id);
           if(isRemoved){
               System.out.println("Patient Remove Successfully!");
           }else{
               System.out.println("No Patient with this Id");
           }
    }

    @Override
    public void getAll() {
        List<Patient> listOfPatient=displayAllPatients();
        for(Patient patient: listOfPatient){
            System.out.println("patient ID :" + patient.getPatientId() + "patient Name:" + patient.getFirstName());
        }
    }

    @Override
    public void search(String keyword) {
        String[] searchedKeyWord=keyword.split(" ");
        if(searchedKeyWord.length ==2){
            Patient searchPatient=searchPatientsByName(searchedKeyWord[0],searchedKeyWord[1]);
            if(searchPatient==null){
                System.out.println("Patient Not found");
            } else {
                System.out.println("Patient Found :" + searchPatient.getFirstName() + searchPatient.getLastName());
            }
        }else{
            System.out.println("You must enter the first name and last name");
        }
    }

    @Override
    public void searchById(String id) {

    }
}
