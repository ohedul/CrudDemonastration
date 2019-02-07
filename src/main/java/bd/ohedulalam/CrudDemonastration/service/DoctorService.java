package bd.ohedulalam.CrudDemonastration.service;

import bd.ohedulalam.CrudDemonastration.model.Doctor;
import bd.ohedulalam.CrudDemonastration.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    //save a doctor
    public Doctor saveDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    //find all doctors
    public List<Doctor> findAll(){
        return doctorRepository.findAll();
    }

    //find one doctor by name
    public Doctor FindByName(String name){
        return doctorRepository.findByName(name);
    }

    //delete a doctor
    public void deleteDoc(Doctor doctor){
        doctorRepository.delete(doctor);
    }
}
