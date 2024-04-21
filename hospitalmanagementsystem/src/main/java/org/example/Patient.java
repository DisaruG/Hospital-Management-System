package org.example;

public class Patient extends Person {
    private String medicalHistroy;
    private String currentHealthStatus;

    public String getMedicalHistroy() {
        return medicalHistroy;
    }

    public void setMedicalHistroy(String medicalHistroy) {
        this.medicalHistroy = medicalHistroy;
    }

    public String getCurrentHealthStatus() {
        return currentHealthStatus;
    }

    public void setCurrentHealthStatus(String currentHealthStatus) {
        this.currentHealthStatus = currentHealthStatus;
    }
}
