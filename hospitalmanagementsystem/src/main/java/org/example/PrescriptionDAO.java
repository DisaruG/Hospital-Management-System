package org.example;

import java.util.List;

public interface PrescriptionDAO {
    Prescription getPrescriptionById(int id);
    List<Prescription> getAllPrescriptions();
    List<Prescription> getPrescriptionsByPatientId(int patientId);
    void addPrescription(Prescription prescription);
    void updatePrescription(Prescription prescription);
    void deletePrescription(int id);
}
