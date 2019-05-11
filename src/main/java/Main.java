import Clinic.Clinic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //через xml
//        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        //через JavaConfig
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Clinic clinic = context.getBean("clinic", Clinic.class);
        clinic.patientZero();
    }
}
