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

    //find patient by name
    public Patient findByName(String name) {
        return patientRepository.findByName(name);
    }

    //find patient by id
    public Patient findPatById(int patient_id){return patientRepository.findByid(patient_id);}
    

    //delete a patient
    public void deletePatient(Patient patient){
        patientRepository.delete(patient);
    }



}
