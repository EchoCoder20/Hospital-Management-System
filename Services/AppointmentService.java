package Services;

import Entities.Appointment;
import Interface.Appointable;
import Interface.Manageable;
import Interface.Searchable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService implements Manageable, Searchable, Appointable {
    List<Appointment> appointmentList=new ArrayList<>();
    public List<Appointment> getAllAppointments() {
        return null;
    }

    public void createAppointment(Appointment appointment) {
        // no return needed for void
    }
    public void createAppointment(String patientId, String doctorId, LocalDate date){

    }
    public void createAppointment(String patientId, String doctorId, LocalDate date, String time){

    }


    public boolean editAppointment(String appointmentId, Appointment updatedAppointment) {
        return false;
    }

    public boolean removeAppointment(String appointmentId) {
        return false;
    }

    public Appointment getAppointmentById(String appointmentId) {
        return null;
    }

    // Additional methods
    public List<Appointment> getAppointmentsByPatient(String patientId) {
        return null;
    }

    public List<Appointment> getAppointmentsByDoctor(String doctorId) {
        return null;
    }

    public List<Appointment> getAppointmentsByDate(LocalDate date) {
        return null;
    }
    public void rescheduleAppointment(String appointmentId, LocalDate newDate){

    }
    public boolean rescheduleAppointment(String appointmentId, LocalDate newDate, String newTime) {
        return false;
    }
    public boolean rescheduleAppointment(Appointment appointment, LocalDate newDate, String newTime, String reason){
        return true;
    }

    @Override
    public void scheduleAppointment(Appointment appointment) {

    }

    public boolean cancelAppointment(String appointmentId) {
        return false;
    }
    public List<Appointment> displayAppointments(LocalDate date){
        return null;
    }
    public List<Appointment> displayAppointments(String doctorId, LocalDate startDate, LocalDate endDate){
        return null;
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
