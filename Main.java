import Entities.Doctor;
import Entities.InPatient;
import Entities.Patient;
import Services.DoctorServices;
import Services.PatientService;
import utils.HelperUtils;
import utils.InputHandler;

import java.security.Provider;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome To Hosbital Management System");
        MainMenu();

    }

    private static void MainMenu() {
        int userInput=0;
        while(userInput!=8){
            System.out.println("Select one of the options from the menu:");
            System.out.println("""
                1. Patient Management
                2. Doctor Management
                3. Nurse Management
                4. Appointment Management
                5. Medical Records Management
                6. Department Management
                7. Reports and Statistics
                8. Exit From the System
                """);
            userInput=scanner.nextInt();
            if(userInput==1){
                patientMenu();
            } else if (userInput==2) {
                doctorMenu();
            }
        }
    }
    private static void doctorMenu(){
        DoctorServices ds=new DoctorServices();
        System.out.println("""
                1 Add Doctor
                2 Add Surgeon
                3 Add Consultant
                4 Add General Practitioner
                5 View All Doctors
                6 Search Doctor by Specialization
                7 View Available Doctors
                8 Assign Patient to Doctor
                9 Update Doctor Information
                10 Remove Doctor
                """);
        int userInput=0;
        while(userInput!=10) {
            String prompt = "Enter your option from (1) to (10) only";
            userInput = InputHandler.getIntInput(prompt, 1, 10);
            if(userInput==1){
                Doctor newDoctor=ds.getDoctorData(1);
                ds.add(newDoctor);
            } else if (userInput==5) {
                ds.getAll();
            } else if (userInput==6) {
                String doctorSpe=InputHandler.getStringInput("Enter Doctor Specialization:");
                List<Doctor> doctorsList=ds.getDoctorsBySpecialization(doctorSpe);
                ds.displayDoctors(doctorsList);
            } else if (userInput==7) {
                List<Doctor> availableDoctor = ds.getAvailableDoctors();
                ds.displayDoctors(availableDoctor);
            } else if (userInput==8) {
                String doctorIdInfo = InputHandler.getStringInput("Enter Doctor ID");
                ds.assignPatient(doctorIdInfo);

            }else if(userInput==9){
                String doctorId= InputHandler.getStringInput("Enter Doctor ID : ");
                ds.searchById(doctorId);

            } else if (userInput==10) {
                String doctorId= InputHandler.getStringInput("Enter Doctor ID : ");
                ds.remove(doctorId);
            }
        }
    }
    private static void patientMenu() {
        PatientService ps=new PatientService();
         System.out.println("""
                1. Register New Patient\s
                2. Register InPatient\s
                3. Register OutPatient\s
                4. Register Emergency Patient\s
                5. View All Patients\s
                6. Search Patient\s
                7. Update Patient Information\s
                8. Remove Patient\s
                9. View Patient Medical History
                """);
        int userInput=0;
        while(userInput!=9){
            String prompt= "Enter your option from (1) to (10) only";
            userInput=InputHandler.getIntInput(prompt,1,10);
            if(userInput==1){
                Patient newPatient=PatientService.createPatientFromInput(1);
                ps.add(newPatient);
//                PatientService.addPatient(newPatient);
            } else if (userInput==2) {
                Patient newPatient=PatientService.createPatientFromInput(2);
                InPatient inPatient=PatientService.createInPatient(newPatient);
                ps.add(newPatient);
                ps.add(inPatient);
//                PatientService.addPatient(inPatient);
            }else if(userInput==5){
               ps.getAll();
            } else if (userInput==6) {
                String patientName= InputHandler.getStringInput("Enter First Name and Last Name of t Patient Name :");
                ps.search(patientName);
            } else if (userInput==7) {
                String patientId= InputHandler.getStringInput("Enter Patient ID : ");
                Patient patient= ps.searchPatients(patientId);
                if(patient==null){
                    System.out.println("No Patient with this ID");
                }else{
                    ps.editPatient(patientId,patient);
                }
            } else if(userInput==8){
                String patientId= InputHandler.getStringInput("Enter Patient ID : ");
                ps.remove(patientId);
            } else if (userInput==9) {
                System.out.println("Get Out From Patient Menu!");
            }
        }
    }
}