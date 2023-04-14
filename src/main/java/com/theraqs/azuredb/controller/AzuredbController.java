package com.theraqs.azuredb.controller;

import com.theraqs.azuredb.entity.Patient;
import com.theraqs.azuredb.service.AzuredbService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class AzuredbController {

    @Autowired
    AzuredbService azuredbService;

    @GetMapping ("/patients")
    public List<Patient> getAllPatients(){
        List<Patient> patientList = azuredbService.getPatients();

        return patientList;
    }

    @PostMapping ("/patient")
    public Patient addPatient(@RequestBody Patient patient){
        return azuredbService.addPatient(patient);
    }

}
