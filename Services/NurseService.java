package Services;

import Entities.Department;
import Entities.Doctor;
import Entities.Nurse;
import Entities.Patient;
import Interface.Manageable;
import Interface.Searchable;
import utils.HelperUtils;
import utils.InputHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NurseService implements Manageable, Searchable {
    List<Nurse> nurses=new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);
    public List<Nurse> getNurses(){
        return null;
    }
    public static Nurse getNurseData(){
        String id = HelperUtils.generateId();
        scanner.nextLine();
        String firstName = InputHandler.getStringInput("Enter First Name:");
        String lastName = InputHandler.getStringInput("Enter Last Name:");
        String gender =InputHandler.getStringInput("Enter Gender :");
        String phoneNumber = InputHandler.getStringInput("Enter phone Number:");
        String email = InputHandler.getStringInput("Enter Email:");
        String address = InputHandler.getStringInput("Enter Address:");
        String nurseId=HelperUtils.generateId("Nus");
        System.out.println("Department Id list:");
        List<Department> departments = DepartmentService.departmentList;
        for(Department dep: departments){
            System.out.println(dep.getDepartmentId());
        }
        String departmentId=InputHandler.getStringInput("Write the department Id from the previous list :");
        String shift=InputHandler.getStringInput("Enter Nurse Shift Time");
        String qualification= InputHandler.getStringInput("Enter Nurse qualification:");
        Nurse newNurse=new Nurse.Builder()
                .setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setGender(gender)
                .setPhoneNumber(phoneNumber)
                .setEmail(email)
                .setAddress(address)
                .setNurseId(nurseId)
                .setDepartmentId(departmentId)
                .setShift(shift)
                .setQualification(qualification)
                .build();

        return newNurse;
    }
    public void addNurse(Nurse nurse){

    }

    public boolean editNurse(String nurseId, Nurse updatedNurse){
        scanner.nextLine();
        String id= updatedNurse.getId();
        String firstName = InputHandler.getStringInput("Update First Name:");
        String lastName = InputHandler.getStringInput("Update Last Name:");
        String gender =updatedNurse.getGender();
        String phoneNumber = InputHandler.getStringInput("Update phone Number:");
        String email = InputHandler.getStringInput("Update Email:");
        String address = InputHandler.getStringInput("Update Address:");
        System.out.println("Department Id list:");
        List<Department> departments = DepartmentService.departmentList;
        for(Department dep: departments){
            System.out.println(dep.getDepartmentId());
        }
        String departmentId=InputHandler.getStringInput("Update the department Id, by select one from the previous list :");
        String shift=InputHandler.getStringInput("Update Nurse Shift Time");
        String qualification= InputHandler.getStringInput("Update Doctor qualification:");

        updatedNurse.setFirstName(firstName);
        updatedNurse.setLastName(lastName);
        updatedNurse.setPhoneNumber(phoneNumber);
        updatedNurse.setEmail(email);
        updatedNurse.setAddress(address);
        updatedNurse.setDepartmentId(departmentId);
        updatedNurse.setShift(shift);
        updatedNurse.setQualification(qualification);
        for(int i=0;i<nurses.size();i++){
            if(nurses.get(i).getNurseId().equalsIgnoreCase(nurseId)){
                nurses.set(i,updatedNurse);
            }
        }
        return true;
    }

    public boolean removeNurse(String nurseId){
        return false;
    }

    public Nurse getNurseById(String nurseId){
        return null;
    }

    public void displayAllNurses(){
        return;
    }
    public void assignPatient(String nurseId){
        boolean isNurseIdFound=false;
        boolean isPatientFound=false;
        Nurse nurseFound = null;
        Patient patientFound=null;
//
        for(Nurse nurse:nurses){
            if(nurse.getNurseId().equalsIgnoreCase(nurseId)){
                isNurseIdFound=true;
                nurseFound=nurse;
            }
        }
        if(!isNurseIdFound){
            System.out.println("No Nurse with this ID!!");
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
            nurseFound.setAssignedPatients(patientFoundedList);
            System.out.println("Patient Successfully assign to Nurse");
        }

    }
    // Additional methods
    public List<Nurse> getNursesByDepartment(String departmentId){
        List<Nurse> nurseListBasedDep=new ArrayList<>();
        for(Nurse nurse:nurses){
            if(nurse.getDepartmentId().equalsIgnoreCase(departmentId)){
                nurseListBasedDep.add(nurse);
            }
        }
        if(nurseListBasedDep.isEmpty()){
            return null;
        }
        return nurseListBasedDep;
    }

    public List<Nurse> getNursesByShift(String shift){
        return null;
    }

    @Override
    public void add(Object entity) {
        nurses.add((Nurse) entity);
    }

    @Override
    public void remove(String id) {
        boolean removedNurse=nurses.removeIf(nurse -> nurse.getNurseId().equalsIgnoreCase(id));
        if(removedNurse){
            System.out.println("Nurse Remove Successfully!");
        }else{
            System.out.println("Nurse ID not Found!");
        }
    }

    @Override
    public void getAll() {
        for(Nurse nurse:nurses){
            System.out.println("Nurse ID :" + nurse.getNurseId() + "Nurse Name:" + nurse.getFirstName());
        }
    }

    @Override
    public void search(String keyword) {

    }

    @Override
    public void searchById(String id) {
        boolean updatedNurse=false;
        for(Nurse nurse:nurses){
            if(nurse.getNurseId().equalsIgnoreCase(id)){
                updatedNurse=editNurse(id,nurse);
            }
        }
        if (updatedNurse){
            System.out.println("Doctor Data Updated Successfully!");
        }else{
            System.out.println("Doctor Id not found!");
        }
    }

}
