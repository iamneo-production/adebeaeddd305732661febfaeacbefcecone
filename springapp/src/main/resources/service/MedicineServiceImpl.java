package com.yourpackage.service;

import com.yourpackage.model.Medicine;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MedicineServiceImpl implements MedicineService {
    private final Map<Integer, Medicine> medicineMap = new HashMap<>();
        private int nextMedicineId = 1;

            @Override
                public boolean addMedicine(Medicine medicine) {
                        medicine.setMedicineId(nextMedicineId++);
                                medicineMap.put(medicine.getMedicineId(), medicine);
                                        return true;
                                            }

                                                @Override
                                                    public Medicine updateMedicine(int medicineId, Medicine updatedMedicine) {
                                                            if (medicineMap.containsKey(medicineId)) {
                                                                        updatedMedicine.setMedicineId(medicineId);
                                                                                    medicineMap.put(medicineId, updatedMedicine);
                                                                                                return updatedMedicine;
                                                                                                        }
                                                                                                                return null; // Medicine not found
                                                                                                                    }
                                                                                                                    }
                                                                                                                    