package bd.ohedulalam.CrudDemonastration.resource;

import bd.ohedulalam.CrudDemonastration.model.Doctor;
import bd.ohedulalam.CrudDemonastration.model.Patient;
import bd.ohedulalam.CrudDemonastration.service.DoctorService;
import bd.ohedulalam.CrudDemonastration.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ApiResource {

    @Autowired
    DoctorService doctorService;
    @Autowired
    PatientService patientService;

    //create doctor -> endpoint /api/save/doctor
    @PostMapping(value = "/save/doctor")
    public Doctor createDoctor(@Valid @RequestBody Doctor doctor){
        return doctorService.saveDoctor(doctor);
    }

    //create patient -> endpoint /api/save/patient
    @PostMapping(value = "/save/patient")
    public Patient createPatient(@Valid @RequestBody Patient patient){
        return patientService.savePatient(patient);
    }

    //find list of all doctor
    @GetMapping(value = "/all/doctors")
    public List<Doctor> findAllDoctor(){
        return doctorService.findAll();
    }

    //find list of all patient
    @GetMapping(value = "/all/patients")
    public List<Patient> findAllPatient(){
        return patientService.findAll();
    }

    //find one doctor by id
    @GetMapping(value = "/get/doctor/{name}")
    public ResponseEntity<Doctor> findDocById(@PathVariable(value = "name") final String name){
        Doctor doctor = doctorService.FindByName(name);
        if(doctor == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(doctor);
    }

    //find one patient by id
    @GetMapping(value = "/get/patient/{name}")
    public ResponseEntity<Patient> findPatById(@PathVariable(value = "name") final String name){
        Patient patient = patientService.findByName(name);
        if(patient == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(patient);
    }

    //update doctor
    @PutMapping(value = "/update/doctor/{name}")
    public ResponseEntity<Doctor> upadateDoctor(@PathVariable(value = "name") final String name, @Valid @RequestBody Doctor docDetails){
        Doctor doctor = doctorService.FindByName(name);
        if(doctor == null){
            return ResponseEntity.notFound().build();
        }

        doctor.setName(docDetails.getName());
        doctor.setDepartment(docDetails.getDepartment());
        doctor.setJoining_date(docDetails.getJoining_date());

        Doctor update = doctorService.saveDoctor(doctor);
        return ResponseEntity.ok().body(update);
    }

    //update patient
    @PutMapping(value = "/update/patient/{name}")
    public ResponseEntity<Patient> updatePatient(@PathVariable(value = "name") final String name, @Valid @RequestBody Patient patDetails){
        Patient patient = patientService.findByName(name);
        if(patient == null){
            return ResponseEntity.notFound().build();
        }

        patient.setName(patDetails.getName());
        patient.setGender(patDetails.getGender());
        patient.setOccupation(patDetails.getOccupation());
        patient.setAge(patDetails.getAge());
        patient.setMobile(patDetails.getMobile());
        patient.setSymptom_summary(patDetails.getSymptom_summary());

        Patient update = patientService.savePatient(patient);
        return ResponseEntity.ok().body(update);
    }

    //delete a doctor
    @DeleteMapping(value = "/delete/doctor/{name}")
    public ResponseEntity<Doctor> deleteDoctor(@PathVariable(value = "name") final String name){
        Doctor doctor = doctorService.FindByName(name);
        if(doctor == null){
            return ResponseEntity.notFound().build();
        }

        doctorService.deleteDoc(doctor);
        return ResponseEntity.ok().build();
    }

    //delete a patient
    @DeleteMapping(value = "/delete/patient/{name}")
    public ResponseEntity<Patient> deletePatient(@PathVariable(value = "name") final String name){
        Patient patient = patientService.findByName(name);
        if(patient == null){
            return ResponseEntity.notFound().build();
        }

        patientService.deletePatient(patient);
        return ResponseEntity.ok().build();
    }


}
