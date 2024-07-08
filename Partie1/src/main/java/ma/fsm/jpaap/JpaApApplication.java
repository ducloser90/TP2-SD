package ma.fsm.jpaap;

import ma.fsm.jpaap.entities.Patient;
import ma.fsm.jpaap.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JpaApApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {

        SpringApplication.run(JpaApApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "Ayoub", new Date(), false, 50));
        patientRepository.save(new Patient(null, "Salim", new Date(), true, 23));
        patientRepository.save(new Patient(null, "Karim", new Date(), false, 40));

        List<Patient> patients = patientRepository.findAll();
        patients.forEach(p->{
            System.out.println("------------------------------");
            System.out.println(p.getId());
            System.out.println(p.getNom());
            System.out.println(p.getScore());
            System.out.println(p.getDateNaissance());
            System.out.println(p.isMalade());

        });

        System.out.println("------------------------------");
        Patient patient = patientRepository.findById(1L).orElse(null);
        if (patient != null) {
            System.out.println("User Found !");
            System.out.println(patient.getId());
            System.out.println(patient.getNom());
            System.out.println(patient.getScore());
            System.out.println(patient.getDateNaissance());
            System.out.println(patient.isMalade());

        }
        patient.setScore(100);
        patientRepository.save(patient);

        patientRepository.deleteById(1L);



    }



}
