package Patient;

import Patient.Patient;
import org.springframework.stereotype.Component;

@Component("PatientMale")
public class PatientMale implements Patient {
    @Override
    public void patientCreated(){
        System.out.println("Male patient was created");
    };
}
