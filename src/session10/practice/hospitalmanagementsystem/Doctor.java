package session10.practice.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }
}