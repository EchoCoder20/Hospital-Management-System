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

    public void addAppointment(Appointment appointment) {
        // no return needed for void
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

    public boolean rescheduleAppointment(String appointmentId, LocalDate newDate, String newTime) {
        return false;
    }

    public boolean cancelAppointment(String appointmentId) {
        return false;
    }
}
