package org.example;

import java.util.ArrayList;
import java.util.List;

public class BillingDAOImpl implements BillingDAO {
    private List<Billing> billings = new ArrayList<>();

    @Override
    public Billing getBillingById(int id) {
        return billings.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Billing> getAllBillings() {
        return billings;
    }

    @Override
    public List<Billing> getBillingsByPatientId(int patientId) {
        return billings.stream().filter(b -> b.getPatient().getId() == patientId).toList();
    }

    @Override
    public void addBilling(Billing billing) {
        billings.add(billing);
    }

    @Override
    public void updateBilling(Billing billing) {
        // Implementation for updating billing
    }

    @Override
    public void deleteBilling(int id) {
        billings.removeIf(b -> b.getId() == id);
    }
}
