package org.example;

import java.util.List;

public interface MedicalRecordDAO {
    MedicalRecord getMedicalRecordById(int id);
    List<MedicalRecord> getAllMedicalRecords();
    List<MedicalRecord> getMedicalRecordsByPatientId(int patientId);
    void addMedicalRecord(MedicalRecord medicalRecord);
    void updateMedicalRecord(MedicalRecord medicalRecord);
    void deleteMedicalRecord(int id);
}
