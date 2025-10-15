package Services;

import Entities.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
    List<Patient> patients=new ArrayList<>();
    public void addPatient(Patient patient){ //full object

    }
    public void addPatient(String firstName, String lastName, String phone){
        //minimal info
    }
    public void addPatient(String firstName, String lastName, String phone, String bloodGroup, String email){
        //with blood group
    }
    public Patient editPatient(String patientId, Patient updatedPatient){
        return null;
    }
    public Boolean removePatient(String patientId){
        return false;
    }
    public Patient getPatientById(String patientId){
        return null;
    }
    public List<Patient> displayAllPatients(){
        return null;
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
        return null;
    }
    public Patient searchPatientsByName(String firstName, String lastName){
        return null;
    }

}
