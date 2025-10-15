package Services;

import Entities.Department;

import java.util.List;

public class DepartmentService {

    public List<Department> getAllDepartments() {
        return null;
    }

    public void addDepartment(Department department) {
        // void method, no return
    }

    public boolean editDepartment(String departmentId, Department updatedDepartment) {
        return false;
    }

    public boolean removeDepartment(String departmentId) {
        return false;
    }

    public Department getDepartmentById(String departmentId) {
        return null;
    }

    // Additional methods
    public void displayAllDepartments() {
        // void method
    }

    public boolean assignDoctorToDepartment(String doctorId, String departmentId) {
        return false;
    }
}
