package Patient;

import org.springframework.stereotype.Component;

@Component("PatientChild")
public class PatientChild implements Patient {
    @Override
    public void patientCreated(){
        System.out.println("Child patient was created");
    };
}
