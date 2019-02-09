package bd.ohedulalam.CrudDemonastration.repository;

import bd.ohedulalam.CrudDemonastration.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    //helps to find a doctor by name
    Doctor findByName(String name);
    //helps to find a doctor by id
    Doctor findByid(int doctor_id);
}
