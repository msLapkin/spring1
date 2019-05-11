package Clinic;

import Clinic.Clinic;
import Patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("clinic")
public class PolyclinicImp implements Clinic {
    private Patient patient;
    public Patient getPatient(){
        return patient;
    }
    @Autowired(required = false)
    @Qualifier("PatientChild")
    public void setPatient (Patient patient) {
        this.patient = patient;
    }
    @Override
    public void patientZero(){
        patient.patientCreated();
        System.out.println("Done!");
    }
}
