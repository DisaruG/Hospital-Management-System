package org.example;

import java.util.List;

public interface PatientDAO {
    Patient getPatientById(int id);
    List<Patient> getAllPatients();
    void addPatient(Patient patient);
    void updatePatient(Patient patient);
    void deletePatient(int id);
}
