package org.example;

import java.util.ArrayList;
import java.util.List;

public class DoctorDAOImpl implements DoctorDAO {
    private List<Doctor> doctors = new ArrayList<>();

    @Override
    public Doctor getDoctorById(int id) {
        return doctors.stream().filter(d -> d.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    @Override
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        Doctor existingDoctor = getDoctorById(doctor.getId());
        if (existingDoctor != null) {
            existingDoctor.setName(doctor.getName());
            existingDoctor.setContactInformation(doctor.getContactInformation());
            existingDoctor.setAddress(doctor.getAddress());
            existingDoctor.setSpecialization(doctor.getSpecialization());
        }
    }

    @Override
    public void deleteDoctor(int id) {
        doctors.removeIf(d -> d.getId() == id);
    }
}
