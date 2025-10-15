package Services;

import Entities.Doctor;
import Entities.Patient;

import java.util.ArrayList;
import java.util.List;

public class DoctorServices {
    List<Doctor> doctors=new ArrayList<>();
    public void addDoctor(Doctor doctor){

    }
    public void addDoctor(String name, String specialization, String phone){

    }
    public void addDoctor(String name, String specialization, String phone, double consultationFee){

    }

    public boolean editDoctor(String doctorId, Doctor updatedDoctor){
        return false;

    }

    public boolean removeDoctor(String doctorId){
        return false;

    }

    public Doctor getDoctorById(String doctorId){
        return null;

    }

    public List<Doctor>  displayAllDoctors(){
        return null;
    }
    public List<Doctor> displayDoctors(String specialization){
        return null;
    }
    public List<Doctor> displayDoctors(String departmentId, boolean showAvailableOnly){
        return null;
    }

    public List<Doctor> getDoctorsBySpecialization(String specialization){
        return null;

    }

    public List<Doctor> getAvailableDoctors(){
        return null;
    }

    public void assignPatient(String doctorId, String patientId){

    }
    public void assignPatient(Doctor doctor, Patient patient){

    }
    public void assignPatient(String doctorId, List<String> patientIds) {
//        - bulk assignment
    }
}
