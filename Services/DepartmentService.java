package Services;

import Entities.Department;
import Interface.Manageable;
import Interface.Searchable;

import java.util.List;

public class DepartmentService implements Manageable, Searchable {

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

    @Override
    public void add(Object entity) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void getAll() {

    }

    @Override
    public void search(String keyword) {

    }

    @Override
    public void searchById(String id) {

    }
}
