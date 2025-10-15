package Services;

import Entities.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorServices {
    List<Doctor> doctors=new ArrayList<>();
    public void addDoctor(Doctor doctor){

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

    public void displayAllDoctors(){

    }

    public List<Doctor> getDoctorsBySpecialization(String specialization){
        return null;

    }

    public List<Doctor> getAvailableDoctors(){
        return null;
    }
}
