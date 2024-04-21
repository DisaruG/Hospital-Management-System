package org.example;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordDAOImpl implements MedicalRecordDAO {
    private List<MedicalRecord> medicalRecords = new ArrayList<>();

    @Override
    public MedicalRecord getMedicalRecordById(int id) {
        return medicalRecords.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecords;
    }

    @Override
    public List<MedicalRecord> getMedicalRecordsByPatientId(int patientId) {
        return medicalRecords.stream().filter(m -> m.getPatient().getId() == patientId).toList();
    }

    @Override
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords.add(medicalRecord);
    }

    @Override
    public void updateMedicalRecord(MedicalRecord medicalRecord) {
        // Implementation for updating medical record
    }

    @Override
    public void deleteMedicalRecord(int id) {
        medicalRecords.removeIf(m -> m.getId() == id);
    }
}
