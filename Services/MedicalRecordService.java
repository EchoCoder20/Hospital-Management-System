package Services;

import Entities.MedicalRecord;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordService {
    List<MedicalRecord> medicalRecordlist=new ArrayList<>();
    public List<MedicalRecord> getAllRecords(){
        return null;
    }

    public void addRecord(MedicalRecord record){

    }

    public boolean editRecord(String recordId, MedicalRecord updatedRecord){
        return false;
    }

    public boolean removeRecord(String recordId){
        return true;
    }

    public MedicalRecord getRecordById(String recordId){
        return null;
    }

    public List<MedicalRecord> getRecordsByPatientId(String patientId){
        return null;
    }

    public List<MedicalRecord> getRecordsByDoctorId(String doctorId){
        return null;
    }

    public void displayPatientHistory(String patientId){

    }
}
