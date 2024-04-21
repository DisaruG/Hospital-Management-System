package org.example;

import java.util.List;

public interface BillingDAO {
    Billing getBillingById(int id);
    List<Billing> getAllBillings();
    List<Billing> getBillingsByPatientId(int patientId);
    void addBilling(Billing billing);
    void updateBilling(Billing billing);
    void deleteBilling(int id);
}
