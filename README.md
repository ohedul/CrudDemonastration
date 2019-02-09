This is a simple demonastration on CRUD(Create, Retrive, Update and Delete) operation.
Here I used two model such Doctor and Patient, then build some rest-endpoint.
To find all Doctors use-> localhost:8080/api/all/doctors
To find all Patients use-> localhost:8080/api/all/patients
To save/insert a doctor into database using POST request the end-point-> localhost:8080/api/save/doctor
To save/insert a patient into database using POST request the end-point-> localhost:8080/api/save/patient
To find a doctor by name(String) use the endpoint-> localhost:8080/api/get/doctor/name
To find a patient by name(String) use the endpoint-> localhost:8080/api/get/patient/name
To find a doctor by id(Integer) use the endpoint-> localhost:8080/api/get/doctor/id/{int id_no} // here id_no is integer value which is auto generated.
To find a patient by id(Integer) use the endpoint-> localhost:8080/api/get/patient/id/{int id_no} // here id_no is integer value which is auto generated.
To update a doctor information using id use the end-point-> localhost:8080/api/update/doctor/{int id_no}
To update a patient information using id use the end-point-> localhost:8080/api/update/patient/{int id_no}
To delete a doctor from record using id use the end-point-> localhost:8080/api/delete/doctor/{int id_no}
To delete a patient from record using id use the end-point-> localhost:8080/api/delete/patient/{int id_no}
