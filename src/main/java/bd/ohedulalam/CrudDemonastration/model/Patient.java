package bd.ohedulalam.CrudDemonastration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Patient {

    @Id
    @GeneratedValue
    @Column(name = "patient_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "mobile")
    private Long mobile;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private Integer age;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "symptom_summary")
    private String symptom_summary;

    public int getId() {
        return id;
    }

    public void setId(int patient_id) {
        this.id = patient_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSymptom_summary() {
        return symptom_summary;
    }

    public void setSymptom_summary(String symptom_summary) {
        this.symptom_summary = symptom_summary;
    }
}
