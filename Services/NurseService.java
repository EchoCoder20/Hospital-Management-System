package Services;

import Entities.Nurse;

import java.util.ArrayList;
import java.util.List;

public class NurseService {
    List<Nurse> nurses=new ArrayList<>();
    public List<Nurse> getNurses(){
        return null;
    }

    public void addNurse(Nurse nurse){

    }

    public boolean editNurse(String nurseId, Nurse updatedNurse){
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

    // Additional methods
    public List<Nurse> getNursesByDepartment(String departmentId){
        return null;
    }

    public List<Nurse> getNursesByShift(String shift){
        return null;
    }
}
