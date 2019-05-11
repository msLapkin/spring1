import Clinic.Clinic;
import Patient.Patient;
import Patient.PatientMale;
import Clinic.PolyclinicImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

//
@Configuration
@ComponentScan({"Clinic","Patient"})
public class AppConfig {
//    @Bean(name = "patient")
//    public Patient patient (){
//        return new PatientMale();
//    }
//
//    @Bean(name = "clinic")
//    public Clinic clinic (Patient patient) {
//        Clinic clinic = new PolyclinicImp();
//        ((PolyclinicImp) clinic).setPatient(patient);
//        return  clinic;
//    }
}
