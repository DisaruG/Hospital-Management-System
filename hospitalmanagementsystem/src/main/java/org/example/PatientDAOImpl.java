package org.example;

import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {
    private List<Patient> patients = new ArrayList<>();

    @Override
    public Patient getPatientById(int id) {
        return patients.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patients;
    }

    @Override
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        Patient existingPatient = getPatientById(patient.getId());
        if (existingPatient != null) {
            existingPatient.setName(patient.getName());
            existingPatient.setContactInformation(patient.getContactInformation());
            existingPatient.setAddress(patient.getAddress());
            existingPatient.setMedicalHistory(patient.getMedicalHistory());
            existingPatient.setCurrentHealthStatus(patient.getCurrentHealthStatus());
        }
    }

    @Override
    public void deletePatient(int id) {
        patients.removeIf(p -> p.getId() == id);
    }
}
