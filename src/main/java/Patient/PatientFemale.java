package Patient;

import Patient.Patient;
import org.springframework.stereotype.Component;

@Component("PatientFemale")
public class PatientFemale implements Patient {
    @Override
    public void patientCreated(){
        System.out.println("Female patient was created");
    };
}
