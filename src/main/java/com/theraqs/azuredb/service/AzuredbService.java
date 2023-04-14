package com.theraqs.azuredb.service;


import com.theraqs.azuredb.entity.Patient;
import com.theraqs.azuredb.repo.PatientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AzuredbService {
    @Autowired
    PatientRepository repo;

    public List<Patient> getPatients(){
        return repo.findAll();
    }

    public Patient addPatient(Patient patient){
        return repo.save(patient);
    }
}
