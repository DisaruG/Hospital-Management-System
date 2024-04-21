package org.example;

import java.util.ArrayList;
import java.util.List;

public class AppointmentDAOImpl implements AppointmentDAO {
    private List<Appointment> appointments = new ArrayList<>();

    @Override
    public Appointment getAppointmentById(int id) {
        return appointments.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    @Override
    public List<Appointment> getAppointmentsByPatientId(int patientId) {
        return appointments.stream().filter(a -> a.getPatient().getId() == patientId).toList();
    }

    @Override
    public List<Appointment> getAppointmentsByDoctorId(int doctorId) {
        return appointments.stream().filter(a -> a.getDoctor().getId() == doctorId).toList();
    }

    @Override
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    @Override
    public void updateAppointment(Appointment appointment) {
        // Implementation for updating appointment
    }

    @Override
    public void deleteAppointment(int id) {
        appointments.removeIf(a -> a.getId() == id);
    }
}
