package com.theraqs.azuredb.repo;

import com.theraqs.azuredb.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository <Patient, Integer> {

}
