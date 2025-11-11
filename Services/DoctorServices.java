package Services;

import Entities.Department;
import Entities.Doctor;
import Entities.Patient;
import Interface.Manageable;
import Interface.Searchable;
import utils.HelperUtils;
import utils.InputHandler;

import javax.print.Doc;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class DoctorServices implements Manageable, Searchable {
    static Scanner scanner=new Scanner(System.in);
    static List<Doctor> doctors=new ArrayList<>();
    public static Doctor getDoctorData(int idType){
        String id = HelperUtils.generateId();
        scanner.nextLine();
        String firstName = InputHandler.getStringInput("Enter First Name:");
        String lastName = InputHandler.getStringInput("Enter Last Name:");
        String gender =InputHandler.getStringInput("Enter Gender :");
        String phoneNumber = InputHandler.getStringInput("Enter phone Number:");
        String email = InputHandler.getStringInput("Enter Email:");
        String address = InputHandler.getStringInput("Enter Address:");
        String doctorId="" ;
        if(idType==2) {
            doctorId = HelperUtils.generateId("Gen-DOC");
        } else if (idType==3) {
            doctorId = HelperUtils.generateId("Con-DOC");
        } else if (idType==4) {
            doctorId = HelperUtils.generateId("Sur-DOC");
        }else{
            doctorId = HelperUtils.generateId("DOC");
        }
        String specialization=InputHandler.getStringInput("Enter Doctor specialization:");
        String qualification= InputHandler.getStringInput("Enter Doctor qualification:");
        int experienceYears=InputHandler.getIntInput("Enter Experience Year:");
        System.out.println("Department Id list:");
        List<Department> departments = DepartmentService.departmentList;
        for(Department dep: departments){
            System.out.println(dep.getDepartmentId());
        }
        String departmentId=InputHandler.getStringInput("Write the department Id from the previous list :");

        double consultationFee=InputHandler.getDoubleInput("Enter consultation Fee:");
        String availableSlot = InputHandler.getStringInput("Enter availableSlots (comma separated):");
        List<String> availableSlots = Arrays.asList(availableSlot.split(","));
        Doctor newDoctor=new Doctor.Builder()
                .setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setGender(gender)
                .setPhoneNumber(phoneNumber)
                .setEmail(email)
                .setAddress(address)
                .setDoctorId(doctorId)
                .setSpecialization(specialization)
                .setQualification(qualification)
                .setExperienceYears(experienceYears)
                .setDepartmentId(departmentId)
                .setConsultationFee(consultationFee)
                .setAvailableSlots(availableSlots)
                .build();
        return newDoctor;
    }
    public void addDoctor(Doctor doctor){

    }
    public void addDoctor(String name, String specialization, String phone){

    }
    public void addDoctor(String name, String specialization, String phone, double consultationFee){

    }

    public boolean editDoctor(String doctorId, Doctor updatedDoctor){
        scanner.nextLine();
        String id= updatedDoctor.getId();
        String firstName = InputHandler.getStringInput("Update First Name:");
        String lastName = InputHandler.getStringInput("Update Last Name:");
        String gender =updatedDoctor.getGender();
        String phoneNumber = InputHandler.getStringInput("Update phone Number:");
        String email = InputHandler.getStringInput("Update Email:");
        String address = InputHandler.getStringInput("Update Address:");
        String specialization=InputHandler.getStringInput("Update Doctor specialization:");
        String qualification= InputHandler.getStringInput("Update Doctor qualification:");
        int experienceYears=InputHandler.getIntInput("Update Experience Year:");
        System.out.println("Department Id list:");
        List<Department> departments = DepartmentService.departmentList;
        for(Department dep: departments){
            System.out.println(dep.getDepartmentId());
        }
        String departmentId=InputHandler.getStringInput("Update the department Id, by select one from the previous list :");

        double consultationFee=InputHandler.getDoubleInput("Update consultation Fee:");
        String availableSlot = InputHandler.getStringInput("Update availableSlots (comma separated):");
        List<String> availableSlots = Arrays.asList(availableSlot.split(","));
        updatedDoctor.setFirstName(firstName);
        updatedDoctor.setLastName(lastName);
        updatedDoctor.setPhoneNumber(phoneNumber);
        updatedDoctor.setEmail(email);
        updatedDoctor.setAddress(address);
        updatedDoctor.setSpecialization(specialization);
        updatedDoctor.setQualification(qualification);
        updatedDoctor.setExperienceYears(experienceYears);
        updatedDoctor.setDepartmentId(departmentId);
        updatedDoctor.setConsultationFee(consultationFee);
        updatedDoctor.setAvailableSlots(availableSlots);
        for(int i=0;i<doctors.size();i++){
            if(doctors.get(i).getDoctorId().equalsIgnoreCase(doctorId)){
                doctors.set(i,updatedDoctor);
            }
        }
        return true;
    }

    public boolean removeDoctor(String doctorId){
        return false;

    }

    public Doctor getDoctorById(String doctorId){
        return null;

    }

    public List<Doctor>  displayAllDoctors(){

        if(doctors.isEmpty()){
            return null;
        }
        return doctors;
    }
    public void displayDoctors(List<Doctor> doctorslist){
        for (Doctor doctor:doctorslist){
            System.out.println("Doctor ID : " + doctor.getDoctorId() + " Doctor Name:" + doctor.getFirstName() + "Doctor Spe :" +  doctor.getSpecialization());
        }
    }
    public List<Doctor> displayDoctors(String departmentId, boolean showAvailableOnly){
        return null;
    }

    public List<Doctor> getDoctorsBySpecialization(String specialization){
        List<Doctor> doctorDetailsByspecialization=new ArrayList<>();
        if(doctors.isEmpty()){
            System.out.println("No Doctors in the list !");
            return null;
        }
        for(Doctor doctor:doctors){
            if(doctor.getSpecialization().equalsIgnoreCase(specialization)){
                doctorDetailsByspecialization.add(doctor);
            }
        }
        if(doctorDetailsByspecialization.isEmpty())
            return null;
        return doctorDetailsByspecialization;
    }

    public List<Doctor> getAvailableDoctors(){
        int dateTime=LocalDateTime.now().getHour();
        List<Doctor> availableDoctor=new ArrayList<>();
//        System.out.println(dateTime);
        for(Doctor doctor: doctors){
           List<String> availableDoctorSlot = doctor.getAvailableSlots();
           for(String availableSlot:availableDoctorSlot){
               String[] hour=availableSlot.split("-");
//               System.out.println(hour[0]);
               if(hour[0].equalsIgnoreCase(String.valueOf(dateTime))){
                   availableDoctor.add(doctor);
               }
           }
       }
       if(availableDoctor.isEmpty()){
           System.out.println("No doctors available on this time!");
           return null;
       }else{
           return availableDoctor;
       }
    }

    public void assignPatient(String doctorId){
        boolean isDoctorIdFound=false;
        boolean isPatientFound=false;
        Doctor doctorFound = null;
        Patient patientFound=null;
//
        for(Doctor doctor:doctors){
            if(doctor.getDoctorId().equalsIgnoreCase(doctorId)){
                isDoctorIdFound=true;
                doctorFound=doctor;
            }
        }
        if(!isDoctorIdFound){
            System.out.println("No Doctors with this ID!!");
        }else{
            List<Patient> patientFoundedList = new ArrayList<>();
            String continueFlag="Y";
            while (continueFlag.equalsIgnoreCase("Y")) {
                String patientIdInfo = InputHandler.getStringInput("Enter Patient ID");
                for (Patient patient:PatientService.patients){
                    if(patient.getPatientId().equalsIgnoreCase(patientIdInfo)){
                        isPatientFound=true;
                        patientFound=patient;

                    }
                }
                if(isPatientFound) {
                    patientFoundedList.add(patientFound);
                }
                else {
                    System.out.println("Patient ID Not found!");
                }
                System.out.println("Do you want to continue assign patient to doctors? (Y/N)");
                continueFlag=scanner.nextLine();
            }
            doctorFound.setAssignedPatients(patientFoundedList);
        }

    }
    public void assignPatient(Doctor doctor, Patient patient){
//
//        patientFoundedList.add(patient);
//        doctor.setAssignedPatients(patientFoundedList);
//        System.out.println("patient assign successfully");
    }
    public void assignPatient(String doctorId, List<String> patientIds) {
//        - bulk assignment
    }

    @Override
    public void add(Object entity) {
        if( entity instanceof Doctor){
            doctors.add((Doctor) entity);
            System.out.println("Doctor Successfully added!!");
        }
    }

    @Override
    public void remove(String id) {
        boolean removeDoctor=doctors.removeIf(doctor -> doctor.getDoctorId().equalsIgnoreCase(id));
        if(removeDoctor){
            System.out.println("Doctor Remove Successfully!");
        }else{
            System.out.println("Doctor ID not Found!");
        }
    }

    @Override
    public void getAll() {
        List<Doctor> listOfDoctor=displayAllDoctors();
        if(listOfDoctor==null){
            System.out.println("No Doctors in the list !");
        }
        else {
            for (Doctor doctor : listOfDoctor) {
                System.out.println("Doctor ID : " + doctor.getDoctorId() + " Doctor Name:" + doctor.getFirstName());
            }
        }
    }

    @Override
    public void search(String keyword) {

    }

    @Override
    public void searchById(String id) {
        boolean updatedDoctor=false;
        for(Doctor doctor:doctors){
            if(doctor.getDoctorId().equalsIgnoreCase(id)){
                updatedDoctor=editDoctor(id,doctor);
            }
        }
        if (updatedDoctor){
            System.out.println("Doctor Data Updated Successfully!");
        }else{
            System.out.println("Doctor Id not found!");
        }

    }
}
