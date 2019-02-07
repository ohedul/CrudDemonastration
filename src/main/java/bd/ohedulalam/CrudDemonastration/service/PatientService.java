package bd.ohedulalam.CrudDemonastration.service;

import bd.ohedulalam.CrudDemonastration.model.Patient;
import bd.ohedulalam.CrudDemonastration.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    //save a patient
    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }

    //find all patients
    public List<Patient> findAll(){
        return patientRepository.findAll();
    }



    //delete a patient
    public void deletePatient(Patient patient){
        patientRepository.delete(patient);
    }


    //find patient by id
    public Patient findByName(String name) {
        return patientRepository.findByName(name);
    }
}
