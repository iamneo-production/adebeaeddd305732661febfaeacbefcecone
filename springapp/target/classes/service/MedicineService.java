package com.yourpackage.service;

import com.yourpackage.model.Medicine;

public interface MedicineService {
    boolean addMedicine(Medicine medicine);

        Medicine updateMedicine(int medicineId, Medicine updatedMedicine);
        }
        