package bd.ohedulalam.CrudDemonastration.repository;

import bd.ohedulalam.CrudDemonastration.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    //helps to find patient by name
    Patient findByName(String name);
    //helps to find patient by name
    Patient findByid(int patient_id);
}
