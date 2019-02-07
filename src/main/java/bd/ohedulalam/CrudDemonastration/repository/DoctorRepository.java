package bd.ohedulalam.CrudDemonastration.repository;

import bd.ohedulalam.CrudDemonastration.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    Doctor findByName(String name);
}
