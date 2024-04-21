package org.example;

import java.util.List;

public interface DoctorDAO {
    Doctor getDoctorById(int id);
    List<Doctor> getAllDoctors();
    void addDoctor(Doctor doctor);
    void updateDoctor(Doctor doctor);
    void deleteDoctor(int id);
}
