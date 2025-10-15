package Services;

import Entities.Appointment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
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
    public boolean rescheduleAppointment(String appointmentId, LocalDate newDate){
        return true;
    }
    public boolean rescheduleAppointment(String appointmentId, LocalDate newDate, String newTime) {
        return false;
    }
    public boolean rescheduleAppointment(Appointment appointment, LocalDate newDate, String newTime, String reason){
        return true;
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
}
